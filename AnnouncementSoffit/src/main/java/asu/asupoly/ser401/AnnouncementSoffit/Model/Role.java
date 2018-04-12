package asu.asupoly.ser401.AnnouncementSoffit.Model;


public class Role {

    private String name;
    private Boolean selected;

    public Role() {}

    public Role(String name, boolean selected) {
        this.name = name;
        this.selected = new Boolean(selected);
    }

    public boolean getPerson() {
        if (name != null) {
            return name.startsWith("USER.");
        }
        return false;
    }

    public String getPersonName() {
        if (name != null && name.startsWith("USER.")) {
            String[] p = name.split("\\.");
            return p[1];
        }
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
}
