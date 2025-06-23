package com.infra_form.service.serviceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infra_form.dto.ApiResponse;
import com.infra_form.dto.BlockFormRequestDto;
import com.infra_form.model.BlockForm;
import com.infra_form.repository.BlockFormRepository;
import com.infra_form.service.BlockFormService;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BlockFormServiceImpl implements BlockFormService {

    private final BlockFormRepository repository;
    private final ObjectMapper objectMapper;

    @Override
    public List<ApiResponse> uploadBlockForms(BlockFormRequestDto requestDTO) {
        return requestDTO.getFormList().stream().map(form -> {
            BlockForm entity = new BlockForm();
            entity.setId(form.getId());
            entity.setUserId(requestDTO.getUserId());
            entity.setZoneId(form.getZoneId());
            entity.setDistrictId(form.getDistrictId());
            entity.setMandalId(form.getMandalId());
            entity.setLocationName(form.getLocationName());
            entity.setLatitude(form.getLatitude());
            entity.setLongitude(form.getLongitude());
            entity.setCreatedDate(form.getCreatedDate());
            entity.setUpdatedDate(form.getUpdatedDate());
            entity.setSyncStatus(1);
            entity.setServerMsg("Data uploaded successfully");
            entity.setFormSubmitStatus(form.getFormSubmitStatus());

            try {
                entity.setPhotoJsonDump(objectMapper.writeValueAsString(form));
            } catch (Exception e) {
                entity.setPhotoJsonDump("[]");
            }

            repository.save(entity);
            return new ApiResponse(form.getId(), 1, "Data uploaded successfully");
        }).collect(Collectors.toList());
    }
}

