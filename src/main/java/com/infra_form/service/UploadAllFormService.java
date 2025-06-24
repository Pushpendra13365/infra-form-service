package com.infra_form.service;

import com.infra_form.dto.UploadAllFormsRequestDto;
import com.infra_form.dto.UploadAllFormsResponseDto;

public interface UploadAllFormService {
    UploadAllFormsResponseDto uploadAllForms(UploadAllFormsRequestDto requestDto);

}
