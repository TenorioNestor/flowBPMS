package com.example.FlowManager.project;

public record DataListProject(String name) {
    public DataListProject(Project project){
        this(project.getName());
    }
}
