package com.infra_form.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UploadAllFormsResponseDto {
    private List<ApiResponse> gpCivilForm;
    private List<ApiResponse> gpPowerForm;
    private List<ApiResponse> nonFeasibleForm;
    private List<ApiResponse> blockForm;
}
