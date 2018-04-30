package org.jasig.portlet.announcements.config;

import org.jasig.portlet.announcements.model.Topic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SuppressWarnings("unused")
public class TopicConfig {

    @Bean(name = "emergencyTopic")
    Topic getEmergencyTopic() {

        Topic topic = new Topic();
        topic.setCreator("automatic");
        topic.setTitle("EMERGENCY");
        topic.setDescription("Do not edit this topic!");
        topic.setAllowRss(false);
        topic.setSubscriptionMethod(4);
        topic.getAudience().add("Everyone");
        topic.getAdmins().add("Portal_Administrators");
        return topic;
    }
}
