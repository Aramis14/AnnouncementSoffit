package org.jasig.portlet.announcements.repository;

import org.jasig.portlet.announcements.model.Announcement;
import org.springframework.data.repository.CrudRepository;

public interface AnnouncementRepository extends CrudRepository<Announcement, Long> {
}
