package com.example.demo.dto;

public record TaskRequestDTO(
        String titulo,
        boolean concluida,
        String prioridade
) {}
