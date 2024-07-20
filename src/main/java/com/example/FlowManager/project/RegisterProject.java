package com.example.FlowManager.project;

import jakarta.validation.constraints.NotBlank;

public record RegisterProject(
        @NotBlank
        String name,
        @NotBlank
        String socialname,
        @NotBlank
        String document,
        String phone,
        String cellphone,
        String email
) {
}
