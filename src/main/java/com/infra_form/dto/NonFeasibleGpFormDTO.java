package com.infra_form.dto;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class NonFeasibleGpFormDTO {
    private Long id;
    private Long zoneId;
    private Long districtId;
    private Long mandalId;
    private Long gpId;
    private String gpCode;
    private String nonFeasibleReason;
    private List<String> photo;
    private Double latitude;
    private Double longitude;
    private Long proposedAlternativeId;
    private Double alternativeLat;
    private Double alternativeLong;
    private List<String> proposedLocPhoto1;
    private List<String> proposedLocPhoto2;
    private List<String> proposedLocPhoto3;
    private List<String> proposedLocPhoto4;
    private String sarpanchName;
    private String sarpanchMobileNo;
    private String isGpMigratedToMunicipal;
    private Double migratedLat;
    private Double migratedLong;
    private List<String> migratedPhoto1;
    private List<String> migratedPhoto2;
    private List<String> migratedPhoto3;
    private List<String> migratedPhoto4;
    private String remarks;
    private String feasibilityRemarks;
    private String rooftopCondition;
    private String isSpaceAvailable;
    private List<String> spacePhoto;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Integer syncStatus;
    private String serverMsg;
    private Integer formSubmitStatus;
}

