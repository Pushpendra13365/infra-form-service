package com.infra_form.controller;

import com.infra_form.dto.ApiResponse;
import com.infra_form.dto.BlockFormRequestDto;
import com.infra_form.service.BlockFormService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/block")
@RequiredArgsConstructor
public class BlockFormController {

    private final BlockFormService blockFormService;

    @PostMapping("/upload")
    public ResponseEntity<List<ApiResponse>> uploadBlockForms(@RequestBody BlockFormRequestDto requestDTO) {
        return ResponseEntity.ok(blockFormService.uploadBlockForms(requestDTO));
    }
}
