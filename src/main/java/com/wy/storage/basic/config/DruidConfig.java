package com.wy.storage.basic.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DruidConfig {

    @Value("${spring.spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String dbUserName;
    @Value("${spring.datasource.password}")
    private String dbPassWord;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Bean
    public DataSource druidSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(dbUrl);
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUsername(dbUserName);
        dataSource.setPassword(dbPassWord);

        return dataSource;
    }
}
