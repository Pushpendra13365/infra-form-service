package com.infra_form.controller;

import com.infra_form.dto.ApiResponse;
import com.infra_form.dto.NonFeasibleGpFormRequestDTO;
import com.infra_form.service.NonFeasibleGpFormService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/non-feasible")
@RequiredArgsConstructor
public class NonFeasibleGpFormController {

    private final NonFeasibleGpFormService service;

    @PostMapping("/upload")
    public ResponseEntity<List<ApiResponse>> uploadNonFeasibleForms(
            @RequestBody NonFeasibleGpFormRequestDTO requestDTO) {
        List<ApiResponse> responses = service.uploadNonFeasibleForms(requestDTO);
        return ResponseEntity.ok(responses);
    }
}

