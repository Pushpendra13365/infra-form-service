package com.infra_form.controller;

import com.infra_form.dto.UploadAllFormsRequestDto;
import com.infra_form.dto.UploadAllFormsResponseDto;
import com.infra_form.service.UploadAllFormService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/forms")
@RequiredArgsConstructor
public class UploadAllFormController {

    private final UploadAllFormService uploadAllFormService;

    @PostMapping("/uploadAll")
    public ResponseEntity<UploadAllFormsResponseDto> uploadAllForms(@RequestBody UploadAllFormsRequestDto requestDto) {
        UploadAllFormsResponseDto responseDto = uploadAllFormService.uploadAllForms(requestDto);
        return ResponseEntity.ok(responseDto);
    }
}
