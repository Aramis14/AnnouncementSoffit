package org.jasig.portlet.announcements.service.dummy;

public class PortletPreferences {

    public String getValue(String name, String dflt) {
        throw new RuntimeException("Dummy impl");
    }

    public String[] getValues(String name, String[] dflt) {
        throw new RuntimeException("Dummy impl");
    }

    public void setValue(String name, String value) {

    }

    public void setValues(String name, String[] values) {

    }

    public void store() {

    }
}
