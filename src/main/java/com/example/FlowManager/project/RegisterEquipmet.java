package com.example.FlowManager.project;

import jakarta.validation.constraints.NotBlank;

public record RegisterEquipmet(

        Kind kind,
        @NotBlank
        String model,
        @NotBlank
        String local,
        @NotBlank
        String password
) {
}
