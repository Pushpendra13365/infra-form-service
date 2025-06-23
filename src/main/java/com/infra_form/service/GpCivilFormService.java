package com.infra_form.service;

import com.infra_form.dto.ApiResponse;
import com.infra_form.dto.GpCivilFormRequestDTO;

import java.util.List;

public interface GpCivilFormService {
    List<ApiResponse> uploadForms(GpCivilFormRequestDTO requestDTO);
}
