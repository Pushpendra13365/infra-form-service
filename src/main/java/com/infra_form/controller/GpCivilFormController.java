package com.infra_form.controller;

import com.infra_form.dto.*;
import com.infra_form.service.GpCivilFormService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gp-civil")
@RequiredArgsConstructor
public class GpCivilFormController {

    private final GpCivilFormService service;

    @PostMapping("/upload")
    public ResponseEntity<List<ApiResponse>> uploadForms(@RequestBody GpCivilFormRequestDTO requestDTO) {
        List<ApiResponse> responses = service.uploadGpCivilForm(requestDTO);
        return ResponseEntity.ok(responses);
    }
}
