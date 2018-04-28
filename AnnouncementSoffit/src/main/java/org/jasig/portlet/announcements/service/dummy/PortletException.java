package org.jasig.portlet.announcements.service.dummy;

public class PortletException extends RuntimeException {
    public PortletException(String message) {
        super(message);
    }

    public PortletException(String message, Throwable cause) {
        super(message, cause);
    }
}
