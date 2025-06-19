package com.infra_form.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GpCivilFormRequestDTO {
    private String userId;
    private List<GpCivilFormDTO> formList;
}
