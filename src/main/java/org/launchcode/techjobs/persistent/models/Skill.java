package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
public class Skill extends AbstractEntity {


    @NotBlank( message = "Description can't be empty")
    @Size( max = 500, message = "Description must have less than 500 characters")
    private String description;
  //skil jobs

    //private List<Job> jobs;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*
    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

     */
}
