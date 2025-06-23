package com.infra_form.service.serviceImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.infra_form.dto.ApiResponse;
import com.infra_form.dto.GpPowerFormRequestDTO;
import com.infra_form.model.GpPowerForm;
import com.infra_form.repository.GpPowerFormRepository;
import com.infra_form.service.GpPowerFormService;
import com.infra_form.util.GpPowerFormMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class GpPowerFormServiceImpl implements GpPowerFormService {

    private final GpPowerFormRepository repository;
    private final ObjectMapper objectMapper;

    @Override
    public List<ApiResponse> saveGpPowerFormList(GpPowerFormRequestDTO request) {
        return request.getFormList().stream().map(form -> {
            GpPowerForm entity = GpPowerFormMapper.mapToEntity(form, request.getUserId(), objectMapper);
            repository.save(entity);
            return new ApiResponse(entity.getId(), 1, "Data uploaded successfully");
        }).collect(Collectors.toList());
    }
}


