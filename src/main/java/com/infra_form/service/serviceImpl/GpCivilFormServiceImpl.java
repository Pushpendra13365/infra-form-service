package com.infra_form.service.serviceImpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infra_form.dto.*;
import com.infra_form.model.GpCivilForm;
import com.infra_form.repository.GpCivilFormRepository;
import com.infra_form.service.GpCivilFormService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GpCivilFormServiceImpl implements GpCivilFormService {

    private final GpCivilFormRepository repository;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public List<ApiResponse> uploadForms(GpCivilFormRequestDTO requestDTO) {
        return requestDTO.getFormList().stream().map(dto -> {
            GpCivilForm form = null;
            try {
                form = GpCivilForm.builder()
                        .id(dto.getId())
                        .zoneId(dto.getZoneId())
                        .districtId(dto.getDistrictId())
                        .mandalId(dto.getMandalId())
                        .gpId(dto.getGpId())
                        .gpCode(dto.getGpCode())
                        .locationName(dto.getLocationName())
                        .gpAddress(dto.getGpAddress())
                        .latitude(dto.getLatitude())
                        .longitude(dto.getLongitude())
                        .createdDate(dto.getCreatedDate())
                        .updatedDate(dto.getUpdatedDate())
                        .formSubmitStatus(dto.getFormSubmitStatus())
                        .syncStatus(1)
                        .serverMsg("Data uploaded successfully")
                        .photoFromLongDistance(toJson(dto.getPhotoFromLongDistance()))
                        .photoPerspectiveLeft(toJson(dto.getPhotoPerspectiveLeft()))
                        .photoPerspectiveRight(toJson(dto.getPhotoPerspectiveRight()))
                        .photoCloseBoardName(toJson(dto.getPhotoCloseBoardName()))
                        .photoElectrificationGP(toJson(dto.getPhotoElectrificationGP()))
                        .photoThreePhasePower(toJson(dto.getPhotoThreePhasePower()))
                        .photoAltElectrification(toJson(dto.getPhotoAltElectrification()))
                        .photoAC(toJson(dto.getPhotoAC()))
                        .photoUPS(toJson(dto.getPhotoUPS()))
                        .photoDG(toJson(dto.getPhotoDG()))
                        .photoServoStabilizer(toJson(dto.getPhotoServoStabilizer()))
                        .servoStabilizerLocationMarking(toJson(dto.getServoStabilizerLocationMarking()))
                        .photoSparePoints(toJson(dto.getPhotoSparePoints()))
                        .photoRackEarthing(toJson(dto.getPhotoRackEarthing()))
                        .photoCableDuct(toJson(dto.getPhotoCableDuct()))
                        .photoSolarEarthing(toJson(dto.getPhotoSolarEarthing()))
                        .photoITInfra(toJson(dto.getPhotoITInfra()))
                        .photoGPSecretary(toJson(dto.getPhotoGPSecretary()))
                        .photoComputerOperator(toJson(dto.getPhotoComputerOperator()))
                        .sarpanchName(dto.getSarpanchName())
                        .sarpanchMobile(dto.getSarpanchMobile())
                        .sarpanchEmail(dto.getSarpanchEmail())
                        .gpSecretaryName(dto.getGpSecretaryName())
                        .secretaryMobile(dto.getSecretaryMobile())
                        .secretaryEmail(dto.getSecretaryEmail())
                        .computerOperatorName(dto.getComputerOperatorName())
                        .computerOperatorMobile(dto.getComputerOperatorMobile())
                        .computerOperatorEmail(dto.getComputerOperatorEmail())
                        .isGpPoPAvailable(dto.getIsGpPoPAvailable())
                        .isSolarRoofTopAvailable(dto.getIsSolarRoofTopAvailable())
                        .roofTopMeasurementSqFt(dto.getRoofTopMeasurementSqFt())
                        .isAltSolarRoofAvailable(dto.getIsAltSolarRoofAvailable())
                        .isAltElectrificationAvailable(dto.getIsAltElectrificationAvailable())
                        .isAcSpaceAvailable(dto.getIsAcSpaceAvailable())
                        .isDgSpaceAvailable(dto.getIsDgSpaceAvailable())
                        .isServoStabilizerSpaceAvailable(dto.getIsServoStabilizerSpaceAvailable())
                        .isSparePointsAvailable(dto.getIsSparePointsAvailable())
                        .isRackEarthingSpaceAvailable(dto.getIsRackEarthingSpaceAvailable())
                        .isCableDuctAvailable(dto.getIsCableDuctAvailable())
                        .isSolarEarthingSpaceAvailable(dto.getIsSolarEarthingSpaceAvailable())
                        .isITInfraAvailable(dto.getIsITInfraAvailable())
                        .distancePowerToUpsAndServo(dto.getDistancePowerToUpsAndServo())
                        .distancePowerToAC(dto.getDistancePowerToAC())
                        .build();

                repository.save(form);
            } catch (JsonProcessingException e) {
                return new ApiResponse(dto.getId(), 0, "Photo data conversion failed");
            }
            return new ApiResponse(dto.getId(), 1, "Data uploaded successfully");
        }).collect(Collectors.toList());
    }

    private String toJson(Set<String> photoSet) throws JsonProcessingException {
        return photoSet == null ? "[]" : objectMapper.writeValueAsString(photoSet);
    }
}