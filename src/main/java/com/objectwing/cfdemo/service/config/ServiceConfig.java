package com.objectwing.cfdemo.service.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.*;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.objectwing.cfdemo.service.PersonService;

import javax.persistence.EntityManagerFactory;


@Configuration
@PropertySource("/config.properties")
@EnableCaching
@EnableTransactionManagement
@Import({CloudFoundryDataSourceConfig.class, LocalDataSourceConfig.class})
@ComponentScan(basePackageClasses = {PersonService.class})
public class ServiceConfig {

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) throws Exception {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
