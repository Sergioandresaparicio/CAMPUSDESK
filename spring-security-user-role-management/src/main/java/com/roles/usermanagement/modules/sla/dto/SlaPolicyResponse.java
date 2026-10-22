package com.roles.usermanagement.modules.sla.dto;

import com.roles.usermanagement.modules.sla.enums.SlaPriority;
import java.time.LocalDateTime;

// EXAMEN Entrega configuración de tiempos y vigencia de SLA a la API - Conecta con: SlaPolicy
public record SlaPolicyResponse(
        Long id,
        String name,
        SlaPriority priority,
        Integer firstResponseHours,
        Integer resolutionHours,
        Boolean isActive,
        LocalDateTime createdAt
) {
}
