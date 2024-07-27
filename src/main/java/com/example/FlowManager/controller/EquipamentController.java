package com.example.FlowManager.controller;

import com.example.FlowManager.project.DataListEquipment;
import com.example.FlowManager.project.Equipment;
import com.example.FlowManager.project.EquipamentRepository;
import com.example.FlowManager.project.RegisterEquipmet;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("equipament")

public class EquipamentController {
    @Autowired
    private EquipamentRepository repository;

    @PostMapping
    @Transactional
    public void registerEquipament(@RequestBody @Valid RegisterEquipmet dados){ repository.save(new Equipment(dados));}

    @GetMapping
    public Page<DataListEquipment> listing(Pageable pageable){
        return repository.findAll(pageable).map(DataListEquipment::new);
    }
}
