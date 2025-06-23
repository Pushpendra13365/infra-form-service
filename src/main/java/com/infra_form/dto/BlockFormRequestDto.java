package com.infra_form.dto;

import lombok.Data;

import java.util.List;
@Data
public class BlockFormRequestDto {
    private Long userId;
    private List<BlockFormDto> formList;
}
