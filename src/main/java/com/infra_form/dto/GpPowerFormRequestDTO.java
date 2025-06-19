package com.infra_form.dto;

import lombok.Data;

import java.util.List;

@Data
public class GpPowerFormRequestDTO {
    private Long userId;
    private List<GpPowerFormDTO> formList;
}
