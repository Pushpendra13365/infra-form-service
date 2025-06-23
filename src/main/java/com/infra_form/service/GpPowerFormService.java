package com.infra_form.service;

import com.infra_form.dto.ApiResponse;
import com.infra_form.dto.GpPowerFormRequestDTO;

import java.util.List;

public interface GpPowerFormService {
    List<ApiResponse> saveGpPowerFormList(GpPowerFormRequestDTO request);

}
