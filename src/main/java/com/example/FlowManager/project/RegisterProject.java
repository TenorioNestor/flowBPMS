package com.example.FlowManager.project;

import jakarta.validation.constraints.NotBlank;

public record RegisterProject(
        @NotBlank
        String name,
        @NotBlank
        String document,
        @NotBlank
        String cep
) {
}
