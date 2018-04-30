package org.jasig.portlet.announcements.service.dummy;

public interface PortletRequest {
    String getRemoteUser();

    PortletPreferences getPreferences();

    boolean isUserInRole(String role);
}
