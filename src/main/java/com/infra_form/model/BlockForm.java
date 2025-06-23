package com.infra_form.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "block_form")
public class BlockForm {
    @Id
    private Long id;

    private Long userId;
    private Long zoneId;
    private Long districtId;
    private Long mandalId;
    private String locationName;
    private String latitude;
    private String longitude;

    @Lob
    private String photoJsonDump;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Integer syncStatus;
    private String serverMsg;
    private Integer formSubmitStatus;
}
