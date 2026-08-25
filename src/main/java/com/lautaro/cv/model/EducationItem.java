package com.lautaro.cv.model;

public class EducationItem {

    private final String title;
    private final String institution;
    private final String status;

    public EducationItem(String title, String institution, String status) {
        this.title = title;
        this.institution = institution;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getInstitution() {
        return institution;
    }

    public String getStatus() {
        return status;
    }

    /** true si figura como "En curso", usado para pintar el badge correcto. */
    public boolean isInProgress() {
        return status != null && status.equalsIgnoreCase("En curso");
    }
}
