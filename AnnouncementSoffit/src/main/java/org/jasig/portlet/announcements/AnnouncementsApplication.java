package org.jasig.portlet.announcements;

import org.jasig.portlet.announcements.model.Topic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableCaching
@ComponentScan(basePackages = {"org.jasig.portlet.announcements"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX,
                pattern = "org.jasig.portlet.announcements.mvc.*"))
public class AnnouncementsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnnouncementsApplication.class, args);
    }

    @Bean(name = "emergencyTopic")
    Topic getEmergencyTopic() {

        Topic topic = new Topic();
        topic.setCreator("automatic");
        topic.setTitle("EMERGENCY");
        topic.setDescription("Do not edit this topic!");
        topic.setAllowRss(false);
        topic.setSubscriptionMethod(Topic.EMERGENCY);
        topic.getAudience().add("Everyone");
        topic.getAdmins().add("Portal_Administrators");
        return topic;
    }
}
