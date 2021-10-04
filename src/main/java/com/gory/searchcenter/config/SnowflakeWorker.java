package com.gory.searchcenter.config;

import com.gory.searchcenter.utils.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Date 2021/10/3
 * @Created by lgy
 */
@Component
public class SnowflakeWorker {
    @Value("${snowflake.datacenterId}")
    private long datacenterId;

    @Value("${snowflake.workId}")
    private long workId;

    private static volatile SnowflakeIdWorker instance;

    public SnowflakeIdWorker getInstance() {
        if (instance == null) {
            synchronized (SnowflakeIdWorker.class) {
                if (instance == null) {
                    instance = new SnowflakeIdWorker(workId, datacenterId);
                }
            }
        }
        return instance;
    }
}
