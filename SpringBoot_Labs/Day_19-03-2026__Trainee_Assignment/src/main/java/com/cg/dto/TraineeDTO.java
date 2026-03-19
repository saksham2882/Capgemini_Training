package com.cg.dto;

public class TraineeDTO {
    private int id;
    private String name;
    private String domain;
    private String location;


    public TraineeDTO() {}

    public TraineeDTO(String name, String domain, String location) {
        this.name = name;
        this.domain = domain;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
