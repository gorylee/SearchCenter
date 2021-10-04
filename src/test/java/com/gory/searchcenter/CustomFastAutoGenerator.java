//package com.gory.searchcenter;
//
//import com.baomidou.mybatisplus.generator.FastAutoGenerator;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.rules.DateType;
//import org.junit.jupiter.api.Test;
//
///**
// * @Date 2021/9/26
// * @Created by lgy
// */
//public class CustomFastAutoGenerator {
//
//
//    @Test
//    public void customFastAutoGenerator() {
//
//        /**
//         * 数据源配置
//         */
//        DataSourceConfig.Builder DATA_SOURCE_CONFIG = new DataSourceConfig
//                .Builder("jdbc:mysql://localhost:3306/test_mybatisplus?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC", "root", "123456");
//
//        // 获取当前工程路径
//        String projectPath = System.getProperty("user.dir");
//        // 拼接出代码最终输出的目录
//        String outputDir = projectPath + "/src/main/java";
//
//        FastAutoGenerator.create(DATA_SOURCE_CONFIG)
//                // 全局配置
//                .globalConfig(builder ->
//                        builder.author("GoryLee")
//                        .dateType(DateType.TIME_PACK)
//                        .commentDate("yyyy-MM-dd")
//                        .outputDir(outputDir))
//                // 包配置
//                .packageConfig(builder->
//                        builder.parent("com.gory.searchcenter")
//                        .entity("model")
//                        .service("service")
//                        .serviceImpl("service.impl")
//                        .mapper("mapper")
//                        .xml("mapper.xml")
//                        .controller("controller"))
//                // 策略配置
//                .strategyConfig(builder ->
//                        builder
//                         //要设置生成哪些表 如果不设置就是生成所有的表
////                        .addInclude("user")
//                        .entityBuilder().formatFileName("%sEntity")
//                        .controllerBuilder().enableHyphenStyle()
//                        .mapperBuilder().formatMapperFileName("%sMapper").formatXmlFileName("%sMapper")
//                        .serviceBuilder().formatServiceFileName("%sService")
//                        .build())
//                /*
//                    模板引擎配置，默认 Velocity 可选模板引擎 Beetl 或 Freemarker
//                   .templateEngine(new BeetlTemplateEngine())
//                   .templateEngine(new FreemarkerTemplateEngine())
//                 */
//                .execute();
//
//
//    }
//}
