package com.cloudWiz.biz.sample.controller;

import com.cloudWiz.biz.sample.dto.OneClickDTO;
import com.cloudWiz.biz.sample.service.OneClickService;
import com.cloudWiz.common.dto.ResponseDTO;
import com.cloudWiz.common.enums.ResponseCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@Api(value = "OneClick API")
@RestController
@RequestMapping("/api/v1/one/click")
@RequiredArgsConstructor
public class OneClickController {

    private final OneClickService oneClickService;

    /**
     * 임시 AWS SDK TEST
     * @param oneClickDTO
     * @return
     */
    @PostMapping("/price")
    @ApiOperation(value = "가격 조회")
    public ResponseDTO<String> selectSempleList(@Valid @RequestBody OneClickDTO oneClickDTO) {
        return new ResponseDTO<>(ResponseCode.OK, oneClickService.selectPriceList(oneClickDTO));
    }
}
