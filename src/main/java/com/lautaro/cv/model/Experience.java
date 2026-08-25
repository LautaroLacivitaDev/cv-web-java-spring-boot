package com.lautaro.cv.model;

import java.util.List;

public class Experience {

    private final String role;
    private final String company;
    private final String period;
    private final List<String> highlights;

    public Experience(String role, String company, String period, List<String> highlights) {
        this.role = role;
        this.company = company;
        this.period = period;
        this.highlights = highlights;
    }

    public String getRole() {
        return role;
    }

    public String getCompany() {
        return company;
    }

    public String getPeriod() {
        return period;
    }

    public List<String> getHighlights() {
        return highlights;
    }
}
