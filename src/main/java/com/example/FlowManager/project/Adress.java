package com.example.FlowManager.project;

import com.example.FlowManager.adress.DataAdress;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
public class Adress {
    private String street;
    private Integer number;
    private String district;
    private String state;
    private String city;
    private Long cep;

    public Adress(DataAdress dados) {
        this.street = dados.street();
        this.number = dados.number();
        this.district = dados.district();
        this.state = dados.state();
        this.city = dados.city();
        this.cep = dados.cep();
    }
}
