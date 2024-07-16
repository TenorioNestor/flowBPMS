package com.example.FlowManager.controller;

import com.example.FlowManager.project.Project;
import com.example.FlowManager.project.ProjectRepository;
import com.example.FlowManager.project.RegisterProject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("project")


public class ProjectController {
    @Autowired
    private ProjectRepository repository;

    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid RegisterProject dados){
        repository.save(new Project(dados));
    }
}
