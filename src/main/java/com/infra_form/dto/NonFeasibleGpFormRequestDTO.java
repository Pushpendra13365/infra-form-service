package com.infra_form.dto;

import lombok.Data;
import java.util.List;

@Data
public class NonFeasibleGpFormRequestDTO {
    private Long userId;
    private List<NonFeasibleGpFormDTO> formList;
}
