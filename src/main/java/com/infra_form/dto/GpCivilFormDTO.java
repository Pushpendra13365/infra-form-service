package com.infra_form.dto;

import lombok.*;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GpCivilFormDTO {
    private Long id;
    private Long zoneId;
    private Long districtId;
    private Long mandalId;
    private Long gpId;
    private String gpCode;
    private String locationName;
    private String gpAddress;
    private Double latitude;
    private Double longitude;
    private String isGpPoPAvailable;
    private String isSolarRoofTopAvailable;
    private Integer roofTopMeasurementSqFt;
    private String isAltSolarRoofAvailable;
    private String isAltElectrificationAvailable;
    private String isAcSpaceAvailable;
    private String isDgSpaceAvailable;
    private String isServoStabilizerSpaceAvailable;
    private String isSparePointsAvailable;
    private String isRackEarthingSpaceAvailable;
    private String isCableDuctAvailable;
    private String isSolarEarthingSpaceAvailable;
    private String isITInfraAvailable;
    private Integer distancePowerToUpsAndServo;
    private Integer distancePowerToAC;
    private String sarpanchName;
    private String sarpanchMobile;
    private String sarpanchEmail;
    private String gpSecretaryName;
    private String secretaryMobile;
    private String secretaryEmail;
    private String computerOperatorName;
    private String computerOperatorMobile;
    private String computerOperatorEmail;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Integer syncStatus;
    private String serverMsg;
    private Integer formSubmitStatus;

    private Set<String> photoFromLongDistance;
    private Set<String> photoPerspectiveLeft;
    private Set<String> photoPerspectiveRight;
    private Set<String> photoCloseBoardName;
    private Set<String> photoElectrificationGP;
    private Set<String> photoThreePhasePower;
    private Set<String> photoAltElectrification;
    private Set<String> photoAC;
    private Set<String> photoUPS;
    private Set<String> photoDG;
    private Set<String> photoServoStabilizer;
    private Set<String> servoStabilizerLocationMarking;
    private Set<String> photoSparePoints;
    private Set<String> photoRackEarthing;
    private Set<String> photoCableDuct;
    private Set<String> photoSolarEarthing;
    private Set<String> photoITInfra;
    private Set<String> photoGPSecretary;
    private Set<String> photoComputerOperator;
}
