package com.infra_form.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "gp_power_form")
@AllArgsConstructor
@NoArgsConstructor
public class GpPowerForm {

    @Id
    private Long id;

    private Long userId;
    private Long zoneId;
    private Long districtId;
    private Long mandalId;
    private Long gpId;
    private String gpCode;
    private String locationName;
    private String gpAddress;
    private Double latitude;
    private Double longitude;
    private Integer roofTopMeasurementSqFt;

    private String isElectrificationInGpPop;
    private String isThreePhasePowerAvailable;
    private String isAlternateRoofTopAvailable;
    private String isAltElectrificationAvailable;
    private String isRegularGridPowerAvailable;
    private String isUpsSpaceAvailable;
    private String isDgSpaceAvailable;
    private String isServoStabilizerSpaceAvailable;
    private String isSparePowerPointsAvailable;
    private String isRackEarthingSpaceAvailable;
    private String isCableDuctAvailable;
    private Integer distancePowerToUpsAndServo;
    private Integer distancePowerToAC;
    private String isSolarEarthingSpaceAvailable;
    private String isITInfraAvailable;

    private String sarpanchName;
    private String sarpanchMobile;
    private String sarpanchEmail;
    private String secretaryEmail;
    private String computerOperatorName;
    private String computerOperatorMobile;
    private String computerOperatorEmail;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Integer syncStatus;
    private String serverMsg;
    private Integer formSubmitStatus;

    @Lob
    private String photoJsonDump;
}

