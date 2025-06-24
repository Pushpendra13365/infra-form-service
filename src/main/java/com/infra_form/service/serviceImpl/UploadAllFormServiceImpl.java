package com.infra_form.service.serviceImpl;

import com.infra_form.dto.*;
import com.infra_form.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UploadAllFormServiceImpl implements UploadAllFormService {

    private final GpCivilFormService gpCivilFormService;
    private final GpPowerFormService gpPowerFormService;
    private final NonFeasibleGpFormService nonFeasibleFormService;
    private final BlockFormService blockFormService;

    @Override
    public UploadAllFormsResponseDto uploadAllForms(UploadAllFormsRequestDto requestDto) {

        GpCivilFormRequestDTO gpCivilDto = new GpCivilFormRequestDTO();
        gpCivilDto.setFormList(requestDto.getGpCivilForm());
        gpCivilDto.setUserId(String.valueOf(requestDto.getUserId()));

        GpPowerFormRequestDTO gpPowerDto = new GpPowerFormRequestDTO();
        gpPowerDto.setFormList(requestDto.getGpPowerForm());
        gpPowerDto.setUserId(requestDto.getUserId());

        NonFeasibleGpFormRequestDTO nonFeasibleDto = new NonFeasibleGpFormRequestDTO();
        nonFeasibleDto.setFormList(requestDto.getNonFeasibleForm());
        nonFeasibleDto.setUserId(requestDto.getUserId());

        BlockFormRequestDto blockDto = new BlockFormRequestDto();
        blockDto.setFormList(requestDto.getBlockForm());
        blockDto.setUserId(requestDto.getUserId());

        List<ApiResponse> gpCivilResponses = gpCivilFormService.uploadGpCivilForm(gpCivilDto);
        List<ApiResponse> gpPowerResponses = gpPowerFormService.saveGpPowerFormList(gpPowerDto);
        List<ApiResponse> nonFeasibleResponses = nonFeasibleFormService.uploadNonFeasibleForms(nonFeasibleDto);
        List<ApiResponse> blockResponses = blockFormService.uploadBlockForms(blockDto);

        return new UploadAllFormsResponseDto(
                gpCivilResponses,
                gpPowerResponses,
                nonFeasibleResponses,
                blockResponses
        );
    }
}
