package com.infra_form.service;

import com.infra_form.dto.ApiResponse;
import com.infra_form.dto.NonFeasibleGpFormRequestDTO;

import java.util.List;

public interface NonFeasibleGpFormService {
    List<ApiResponse> uploadNonFeasibleForms(NonFeasibleGpFormRequestDTO requestDTO);
}
