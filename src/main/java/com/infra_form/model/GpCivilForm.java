package com.infra_form.model;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "gp_civil_form")
public class GpCivilForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    private Integer formSubmitStatus;
    private Integer syncStatus;
    private String serverMsg;

    @Column(columnDefinition = "TEXT")
    private String photoFromLongDistance;

    @Column(columnDefinition = "TEXT")
    private String photoPerspectiveLeft;

    @Column(columnDefinition = "TEXT")
    private String photoPerspectiveRight;

    @Column(columnDefinition = "TEXT")
    private String photoCloseBoardName;

    @Column(columnDefinition = "TEXT")
    private String photoElectrificationGP;

    @Column(columnDefinition = "TEXT")
    private String photoThreePhasePower;

    @Column(columnDefinition = "TEXT")
    private String photoAltElectrification;

    @Column(columnDefinition = "TEXT")
    private String photoAC;

    @Column(columnDefinition = "TEXT")
    private String photoUPS;

    @Column(columnDefinition = "TEXT")
    private String photoDG;

    @Column(columnDefinition = "TEXT")
    private String photoServoStabilizer;

    @Column(columnDefinition = "TEXT")
    private String servoStabilizerLocationMarking;

    @Column(columnDefinition = "TEXT")
    private String photoSparePoints;

    @Column(columnDefinition = "TEXT")
    private String photoRackEarthing;

    @Column(columnDefinition = "TEXT")
    private String photoCableDuct;

    @Column(columnDefinition = "TEXT")
    private String photoSolarEarthing;

    @Column(columnDefinition = "TEXT")
    private String photoITInfra;

    @Column(columnDefinition = "TEXT")
    private String photoGPSecretary;

    @Column(columnDefinition = "TEXT")
    private String photoComputerOperator;
}
