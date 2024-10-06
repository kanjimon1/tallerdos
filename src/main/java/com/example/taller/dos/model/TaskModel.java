package com.example.taller.dos.model;

public class TaskModel {

    private Long id;
    private String description;
    private boolean completed;

    public TaskModel(){}

    public TaskModel(Long id, String description, boolean completed){
        this.id = id;
        this.description = description;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString(){
        return "TaskModel{" +
                "id=" + id +
                        ", description='" + description + '\'' +
                        ", completed=" + completed +
                        '}';
    }
}
