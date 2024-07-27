package com.example.FlowManager.project;

import com.example.FlowManager.adress.DataAdress;
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
    private String socialname;
    private String document;
    private String phone;
    private String cellphone;
    private String email;
    @Embedded
    private Adress adress;


    public Project(RegisterProject dados){
        this.name = dados.name();
        this.socialname = dados.socialname();
        this.document = dados.document();
        this.phone = dados.phone();
        this.cellphone = dados.cellphone();
        this.email = dados.email();
        this.adress = new Adress(dados.dataAdress());
    }
}
