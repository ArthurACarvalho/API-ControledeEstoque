package com.example.demo.Dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductDto(
        @NotBlank String nome,
        @NotBlank String descricao,
        @NotNull @Min(0) int quantidade,
        @NotNull @Min(0) Double preco
){}