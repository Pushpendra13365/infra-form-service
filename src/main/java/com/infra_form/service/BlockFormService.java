package com.infra_form.service;

import com.infra_form.dto.ApiResponse;
import com.infra_form.dto.BlockFormRequestDto;

import java.util.List;

public interface BlockFormService {
    List<ApiResponse> uploadBlockForms(BlockFormRequestDto requestDto);
}
