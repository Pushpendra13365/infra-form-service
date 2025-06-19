package com.infra_form.service;

import com.infra_form.dto.GpPowerFormRequestDTO;
import com.infra_form.dto.GpPowerFormResponseDTO;

import java.util.List;

public interface GpPowerFormService {
    List<GpPowerFormResponseDTO> saveGpPowerFormList(GpPowerFormRequestDTO request);

}
