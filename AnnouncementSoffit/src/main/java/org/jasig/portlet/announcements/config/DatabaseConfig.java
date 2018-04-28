package org.jasig.portlet.announcements.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;

@Configuration
@SuppressWarnings("unused")
@PropertySource("classpath:datasource.properties")
public class DatabaseConfig {

    @Autowired
    Environment environment;

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);

        //TODO: Switch to annotations instead of XML mappings
        //em.setPackagesToScan("org.jasig.portlet.announcements.model");

        em.setMappingResources(
                "hibernate-mappings/Announcement.hbm.xml",
                "hibernate-mappings/Topic.hbm.xml",
                "hibernate-mappings/TopicSubscription.hbm.xml");
        return em;
    }
}
