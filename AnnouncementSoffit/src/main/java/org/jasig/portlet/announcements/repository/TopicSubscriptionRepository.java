package org.jasig.portlet.announcements.repository;

import org.jasig.portlet.announcements.model.TopicSubscription;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TopicSubscriptionRepository extends CrudRepository<TopicSubscription, Long> {

    @Query("select ts from TopicSubscription ts where ts.owner = ?1")
    List<TopicSubscription> getTopicSubscriptionFor(String username);

    @Query("select ts from TopicSubscription ts where ts.topic = ?1")
    List<TopicSubscription> getTopicSubscriptionByTopicId(Long topicId);
}
