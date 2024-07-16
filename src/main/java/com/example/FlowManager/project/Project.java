package com.example.FlowManager.project;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "project")
@Entity(name = "Project")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Project {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String document;
    private String cep;

    public Project(RegisterProject dados){
        this.name = dados.name();
        this.cep = dados.cep();
        this.document = dados.document();
    }
}
