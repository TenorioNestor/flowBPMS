package com.example.FlowManager.adress;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DataAdress(
        @NotBlank
        String street,
        @NotBlank
        Integer number,
        @NotBlank
        String district,
        @NotBlank
        String state,
        @NotBlank
        String city,
        @NotNull
        Long cep

) {
}
