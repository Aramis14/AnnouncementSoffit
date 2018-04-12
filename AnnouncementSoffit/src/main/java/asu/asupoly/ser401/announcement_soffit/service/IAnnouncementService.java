package asu.asupoly.ser401.announcement_soffit.service;

import asu.asupoly.ser401.announcement_soffit.model.Announcement;


/**
 * @author Hannah Do hhdo2@asu.edu
 *     
 */
public interface IAnnouncementService {


  public Announcement getAnnouncement(Long id) throws Exception;

}
