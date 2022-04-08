package com.systemspecs.coronavirustracker.models;

public class LocationStats {
    private String state;
    private String Country;
    private Integer latestTotalCases;
    private Integer diffFromPreviousDay;

    public Integer getDiffFromPreviousDay() {
        return diffFromPreviousDay;
    }

    public void setDiffFromPreviousDay(Integer diffFromPreviousDay) {
        this.diffFromPreviousDay = diffFromPreviousDay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public Integer getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(Integer latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", Country='" + Country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
