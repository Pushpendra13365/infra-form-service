package com.infra_form.dto;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class GpPowerFormDTO {
    private Long id;
    private Long zoneId;
    private Long districtId;
    private Long mandalId;
    private Long gpId;
    private String gpCode;
    private String locationName;
    private List<String> photoFromLongDistance;
    private List<String> photoPerspectiveLeft;
    private List<String> photoPerspectiveRight;
    private List<String> photoCloseBoardName;
    private String gpAddress;
    private Double latitude;
    private Double longitude;
    private Integer roofTopMeasurementSqFt;
    private String isElectrificationInGpPop;
    private List<String> photoElectrificationGp;
    private String isThreePhasePowerAvailable;
    private List<String> photoThreePhasePower;
    private String isAlternateRoofTopAvailable;
    private String isAltElectrificationAvailable;
    private List<String> photoAltElectrification;
    private String isRegularGridPowerAvailable;
    private List<String> photoAC;
    private String isUpsSpaceAvailable;
    private List<String> photoUPS;
    private String isDgSpaceAvailable;
    private List<String> photoDG;
    private String isServoStabilizerSpaceAvailable;
    private List<String> photoServoStabilizer;
    private List<String> servoStabilizerLocationMarking;
    private String isSparePowerPointsAvailable;
    private List<String> photoSparePoints;
    private String isRackEarthingSpaceAvailable;
    private List<String> photoRackEarthing;
    private String isCableDuctAvailable;
    private List<String> photoCableDuct;
    private Integer distancePowerToUpsAndServo;
    private Integer distancePowerToAC;
    private String isSolarEarthingSpaceAvailable;
    private List<String> photoSolarEarthing;
    private String isITInfraAvailable;
    private List<String> photoITInfra;
    private String sarpanchName;
    private String sarpanchMobile;
    private String sarpanchEmail;
    private String secretaryEmail;
    private String computerOperatorName;
    private List<String> photoComputerOperator;
    private String computerOperatorMobile;
    private String computerOperatorEmail;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Integer syncStatus;
    private String serverMsg;
    private Integer formSubmitStatus;
}

