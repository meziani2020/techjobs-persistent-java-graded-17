package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {


    @NotBlank( message = "Location can't be empty")
    @Size(min = 3, max = 200, message = "Location must have less than 200 characters")
    private String location;

    @OneToMany(mappedBy = "employer")
    //@JoinColumn(name = "id")
    private final List<Job> jobs= new ArrayList<>();

    public Employer(){}
    public Employer(String name, String location){
        this.setName(name);
        this.setLocation(location);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public List<Job> getJobs() {
        return jobs;
    }




}

