package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Entity;

@Entity
public class Employer extends AbstractEntity {

//    @OneToOne
    @Valid
    @NotNull
    @Size(min = 3, max = 50, message = "Location must be between 3 and 50 characters")
    private String location;

    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }




}
