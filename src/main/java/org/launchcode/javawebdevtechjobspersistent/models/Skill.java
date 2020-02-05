package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description is required")
    @Size(min = 1, max = 100, message = "Description must be between 1 and 100 characters")
    private String description;

    public Skill(){}
}