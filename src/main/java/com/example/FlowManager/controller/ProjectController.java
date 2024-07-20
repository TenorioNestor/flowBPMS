package com.example.FlowManager.controller;

import com.example.FlowManager.project.DataListProject;
import com.example.FlowManager.project.Project;
import com.example.FlowManager.project.ProjectRepository;
import com.example.FlowManager.project.RegisterProject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public Page<DataListProject> listing(Pageable pageable){
        return repository.findAll(pageable).map(DataListProject::new);
    }
}
