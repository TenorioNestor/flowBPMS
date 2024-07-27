package com.example.FlowManager.project;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "equipment")
@Entity(name = "Equipment")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Equipment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    @Enumerated(EnumType.STRING)
    private Kind kind;
    private String local;
    private String password;


    public Equipment(RegisterEquipmet dados){
        this.model = dados.model();
        this.local = dados.local();
        this.password = dados.password();
        this.kind = dados.kind();
    }

}
