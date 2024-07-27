package com.example.FlowManager.project;

public record DataListEquipment(String local) {
    public DataListEquipment(Equipment equipment){
        this(equipment.getLocal());
    }
}
