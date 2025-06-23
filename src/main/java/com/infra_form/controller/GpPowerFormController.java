package com.infra_form.controller;

import com.infra_form.dto.ApiResponse;
import com.infra_form.dto.GpPowerFormRequestDTO;
import com.infra_form.service.GpPowerFormService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gp-power")
@RequiredArgsConstructor
public class GpPowerFormController {

    private final GpPowerFormService gpPowerFormService;

    @PostMapping("/upload")
    public ResponseEntity<List<ApiResponse>> uploadGpPowerForm(@RequestBody GpPowerFormRequestDTO request) {
        List<ApiResponse> response = gpPowerFormService.saveGpPowerFormList(request);
        return ResponseEntity.ok(response);
    }
}

