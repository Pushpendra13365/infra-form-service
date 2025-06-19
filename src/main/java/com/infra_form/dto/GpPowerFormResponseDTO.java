package com.infra_form.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GpPowerFormResponseDTO {
    private Long id;
    private Integer syncStatus;
    private String serverMsg;
}
