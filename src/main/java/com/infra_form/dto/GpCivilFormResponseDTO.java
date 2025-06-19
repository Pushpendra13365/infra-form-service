package com.infra_form.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GpCivilFormResponseDTO {
    private Long id;
    private int syncStatus;
    private String serverMsg;
}
