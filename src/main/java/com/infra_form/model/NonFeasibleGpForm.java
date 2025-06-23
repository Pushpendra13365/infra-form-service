package com.infra_form.model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "non_feasible_gp_form")
public class NonFeasibleGpForm {

    @Id
    private Long id;

    private Long userId;
    private Long zoneId;
    private Long districtId;
    private Long mandalId;
    private Long gpId;
    private String gpCode;
    private String nonFeasibleReason;

    @Lob
    private String photoJsonDump;

    private Double latitude;
    private Double longitude;
    private Long proposedAlternativeId;
    private Double alternativeLat;
    private Double alternativeLong;

    private String sarpanchName;
    private String sarpanchMobileNo;
    private String isGpMigratedToMunicipal;
    private Double migratedLat;
    private Double migratedLong;
    private String remarks;
    private String feasibilityRemarks;
    private String rooftopCondition;
    private String isSpaceAvailable;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Integer syncStatus;
    private String serverMsg;
    private Integer formSubmitStatus;
}

