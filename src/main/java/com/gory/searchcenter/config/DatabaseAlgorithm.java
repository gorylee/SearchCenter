package com.gory.searchcenter.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @Date 2021/10/3
 * @Created by lgy
 */

public class DatabaseAlgorithm implements PreciseShardingAlgorithm<Long> {
    @Override
    public String doSharding(Collection<String> databaseNames, PreciseShardingValue<Long> shardingValue) {
        Long shardResult = Math.abs((long) shardingValue.getValue().hashCode()) % 2;
        for (String databaseName : databaseNames) {
            String shardValue = String.format("%02d", shardResult);
            if (databaseName.endsWith(shardValue)){
                System.out.println("shardingValue:"+shardingValue+", databaseName:" + databaseName);
                return databaseName;
            }
        }
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        String ss = "T20200227045046";
        Long shardResult = Math.abs((long) ss.hashCode()) % 32;
        System.out.println(shardResult);
        shardResult = Math.abs((long) ss.hashCode()) / 32 % 32;
        System.out.println(shardResult);

    }
}
