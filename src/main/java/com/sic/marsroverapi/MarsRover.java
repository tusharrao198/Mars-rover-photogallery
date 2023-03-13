package com.sic.marsroverapi;

public class MarsRover {
    private Long id;
    private String name;
    private String landingDate;
    private String launchDate;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLandingDate() {
        return landingDate;
    }

    public void setLandingDate(String landingDate) {
        this.landingDate = landingDate;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MarsRover{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", landingDate='" + landingDate + '\'' +
                ", launchDate='" + launchDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
