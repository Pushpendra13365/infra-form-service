package com.infra_form.dto;

import lombok.Data;

import java.util.List;

@Data
public class UploadAllFormsRequestDto {
    private Long userId;
    private List<GpCivilFormDTO> gpCivilForm;
    private List<GpPowerFormDTO> gpPowerForm;
    private List<NonFeasibleGpFormDTO> nonFeasibleForm;
    private List<BlockFormDto> blockForm;
}
