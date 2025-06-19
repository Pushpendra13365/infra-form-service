package com.infra_form.service;

import com.infra_form.dto.GpCivilFormRequestDTO;
import com.infra_form.dto.GpCivilFormResponseDTO;

import java.util.List;

public interface GpCivilFormService {
    List<GpCivilFormResponseDTO> uploadForms(GpCivilFormRequestDTO requestDTO);
}
