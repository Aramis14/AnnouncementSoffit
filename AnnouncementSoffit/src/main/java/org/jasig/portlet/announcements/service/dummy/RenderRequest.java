package org.jasig.portlet.announcements.service.dummy;

public class RenderRequest implements PortletRequest {
    @Override
    public String getRemoteUser() {
        return null;
    }

    @Override
    public PortletPreferences getPreferences() {
        return null;
    }

    @Override
    public boolean isUserInRole(String role) {
        return false;
    }
}
