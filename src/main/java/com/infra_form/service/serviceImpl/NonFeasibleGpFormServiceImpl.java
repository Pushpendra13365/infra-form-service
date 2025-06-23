package com.infra_form.service.serviceImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.infra_form.dto.ApiResponse;
import com.infra_form.dto.NonFeasibleGpFormRequestDTO;
import com.infra_form.model.NonFeasibleGpForm;
import com.infra_form.repository.NonFeasibleGpFormRepository;
import com.infra_form.service.NonFeasibleGpFormService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class NonFeasibleGpFormServiceImpl implements NonFeasibleGpFormService {

    private final NonFeasibleGpFormRepository repository;
    private final ObjectMapper objectMapper;

    @Override
    public List<ApiResponse> uploadNonFeasibleForms(NonFeasibleGpFormRequestDTO requestDTO) {
        return requestDTO.getFormList().stream().map(form -> {
            NonFeasibleGpForm entity = new NonFeasibleGpForm();
            entity.setId(form.getId());
            entity.setUserId(requestDTO.getUserId());
            entity.setZoneId(form.getZoneId());
            entity.setDistrictId(form.getDistrictId());
            entity.setMandalId(form.getMandalId());
            entity.setGpId(form.getGpId());
            entity.setGpCode(form.getGpCode());
            entity.setNonFeasibleReason(form.getNonFeasibleReason());
            entity.setLatitude(form.getLatitude());
            entity.setLongitude(form.getLongitude());
            entity.setProposedAlternativeId(form.getProposedAlternativeId());
            entity.setAlternativeLat(form.getAlternativeLat());
            entity.setAlternativeLong(form.getAlternativeLong());
            entity.setSarpanchName(form.getSarpanchName());
            entity.setSarpanchMobileNo(form.getSarpanchMobileNo());
            entity.setIsGpMigratedToMunicipal(form.getIsGpMigratedToMunicipal());
            entity.setMigratedLat(form.getMigratedLat());
            entity.setMigratedLong(form.getMigratedLong());
            entity.setRemarks(form.getRemarks());
            entity.setFeasibilityRemarks(form.getFeasibilityRemarks());
            entity.setRooftopCondition(form.getRooftopCondition());
            entity.setIsSpaceAvailable(form.getIsSpaceAvailable());
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

