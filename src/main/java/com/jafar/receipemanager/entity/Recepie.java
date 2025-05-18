package com.jafar.receipemanager.entity;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class Recepie {

    @Id
    private String id;

    private String title;
    private String instructions;
    private List<String> ingredients;
    private List<String> category;
    private Date createdOn;

    public Recepie(){}

    public Recepie(String id, String title, String instructions, List<String> ingredients, List<String> category, Date createdOn) {
        this.id = id;
        this.title = title;
        this.instructions = instructions;
        this.ingredients = ingredients;
        this.category = category;
        this.createdOn = createdOn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
