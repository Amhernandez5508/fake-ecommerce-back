package com.hernandezalejandro.apiloginforjs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
public class ConfigDatabase {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://dpg-cnd7tqmn7f5s73bkd0m0-a/fake_ecommerce_db");
        dataSource.setUsername("fake_ecommerce_db_user");
        dataSource.setPassword("rNlXwLpIctqS4VJhmYNa6HyTvZHxmZ4d");
        return dataSource;
    }
}