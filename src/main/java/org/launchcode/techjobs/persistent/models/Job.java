package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

   // @Id
   // @GeneratedValue
  //  private int id;

   // private String name;
    //private String employer;

    @ManyToOne
    @JoinColumn(name="employer_id")
    private Employer employer;


    @ManyToMany
    private List<Skill> skills=new ArrayList<>();



    public Job() {
    }

    // Initialize the id and value fields.
    public Job(Employer anEmployer, List<Skill> someSkills) {
        //to do  : list of skills  not integers
        super();
        this.employer = anEmployer;
        // parse the skils
        //this.setSkills(someSkills);
        this.skills = someSkills;
    }

    // Getters and setters.
    
    /*
    public String getName() {
        return name;
    }

     */
/*
    public void setName(String name) {
        this.name = name;
    }
*/
    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

}
