package com.infra_form.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class BlockFormDto {
    private Long id;
    private Long zoneId;
    private Long districtId;
    private Long mandalId;
    private String locationName;
    private String latitude;
    private String longitude;
    private String civilSiteType;
    private String cableTrayAvailable;
    private String earthingAvailable;
    private String isAcSpaceAvailable;
    private String isBatterySpaceAvailiable;
    private String isBsnlMediaAvailable;
    private String isCableDuctAvailable;
    private String isDgSpaceAvailable;
    private String isFDMSRackspaceAvailable;
    private String isRegularGridPowerAvailable;
    private String isRouterRackspaceAvailable;
    private String isServoStabilizerSpaceAvailable;
    private String isUpsSpaceAvailable;
    private String existingPlantLoadDetails;
    private String infrastructureUpgradeRequired;
    private String idDgSetsAvailable;
    private String ownedOrRented;
    private String powerSupplyType;
    private String powerCapacity;
    private String noOfBattery;
    private String noOfModulesWorking;
    private String districtExecutiveName;
    private String mobileOfDistrictExecutive;
    private String emailOfDistrictExecutive;
    private String landlineOfDistrictExecutive;
    private String exchangeInchargeName;
    private String mobileOfExchangeIncharge;
    private String emailOfExchangeIncharge;
    private String landlineOfExchangeIncharge;
    private String distancePowerToUpsAndServo;
    private String distancePowerToAC;
    private String servoStabilizerLocationMark;
    private String zoneMandalAddress;
    private List<String> photoFromLongDistance;
    private List<String> photoPerspectiveLeft;
    private List<String> photoPerspectiveRight;
    private List<String> photoCloseBoardName;
    private List<String> photoAC;
    private List<String> photoUPS;
    private List<String> photoDG;
    private List<String> photoCableDuct;
    private List<String> photoOfCableTray;
    private List<String> photoOfCivilSite;
    private List<String> photoFDMSRack;
    private List<String> photoRouterRack;
    private List<String> photoServoStabilizer;
    private List<String> photoOfDistrictExecutive;
    private List<String> photoOfExchangeIncharge;
    private List<String> photoOfPowerPlant;
    private List<String> photoOfPowerSupply;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Integer syncStatus;
    private String serverMsg;
    private Integer formSubmitStatus;
}

