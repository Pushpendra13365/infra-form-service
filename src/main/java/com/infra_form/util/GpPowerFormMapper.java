package com.infra_form.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infra_form.dto.GpPowerFormDTO;
import com.infra_form.model.GpPowerForm;

public class GpPowerFormMapper {

    public static GpPowerForm mapToEntity(GpPowerFormDTO dto, Long userId, ObjectMapper objectMapper) {
        GpPowerForm entity = new GpPowerForm();
        entity.setId(dto.getId());
        entity.setUserId(userId);
        entity.setZoneId(dto.getZoneId());
        entity.setDistrictId(dto.getDistrictId());
        entity.setMandalId(dto.getMandalId());
        entity.setGpId(dto.getGpId());
        entity.setGpCode(dto.getGpCode());
        entity.setLocationName(dto.getLocationName());
        entity.setGpAddress(dto.getGpAddress());
        entity.setLatitude(dto.getLatitude());
        entity.setLongitude(dto.getLongitude());
        entity.setRoofTopMeasurementSqFt(dto.getRoofTopMeasurementSqFt());
        entity.setIsElectrificationInGpPop(dto.getIsElectrificationInGpPop());
        entity.setIsThreePhasePowerAvailable(dto.getIsThreePhasePowerAvailable());
        entity.setIsAlternateRoofTopAvailable(dto.getIsAlternateRoofTopAvailable());
        entity.setIsAltElectrificationAvailable(dto.getIsAltElectrificationAvailable());
        entity.setIsRegularGridPowerAvailable(dto.getIsRegularGridPowerAvailable());
        entity.setIsUpsSpaceAvailable(dto.getIsUpsSpaceAvailable());
        entity.setIsDgSpaceAvailable(dto.getIsDgSpaceAvailable());
        entity.setIsServoStabilizerSpaceAvailable(dto.getIsServoStabilizerSpaceAvailable());
        entity.setIsSparePowerPointsAvailable(dto.getIsSparePowerPointsAvailable());
        entity.setIsRackEarthingSpaceAvailable(dto.getIsRackEarthingSpaceAvailable());
        entity.setIsCableDuctAvailable(dto.getIsCableDuctAvailable());
        entity.setDistancePowerToUpsAndServo(dto.getDistancePowerToUpsAndServo());
        entity.setDistancePowerToAC(dto.getDistancePowerToAC());
        entity.setIsSolarEarthingSpaceAvailable(dto.getIsSolarEarthingSpaceAvailable());
        entity.setIsITInfraAvailable(dto.getIsITInfraAvailable());
        entity.setSarpanchName(dto.getSarpanchName());
        entity.setSarpanchMobile(dto.getSarpanchMobile());
        entity.setSarpanchEmail(dto.getSarpanchEmail());
        entity.setSecretaryEmail(dto.getSecretaryEmail());
        entity.setComputerOperatorName(dto.getComputerOperatorName());
        entity.setComputerOperatorMobile(dto.getComputerOperatorMobile());
        entity.setComputerOperatorEmail(dto.getComputerOperatorEmail());
        entity.setCreatedDate(dto.getCreatedDate());
        entity.setUpdatedDate(dto.getUpdatedDate());
        entity.setSyncStatus(1);
        entity.setServerMsg("Data uploaded successfully");
        entity.setFormSubmitStatus(dto.getFormSubmitStatus());

        try {
            entity.setPhotoJsonDump(objectMapper.writeValueAsString(dto));
        } catch (JsonProcessingException e) {
            entity.setPhotoJsonDump("[]");
        }

        return entity;
    }
}

