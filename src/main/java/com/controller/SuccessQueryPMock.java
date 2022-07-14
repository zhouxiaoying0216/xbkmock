package com.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

//@Api(description = "接口文档")
@RestController
@RequestMapping(value = "/")
@Slf4j
public class SuccessQueryPMock {
//    @ApiOperation(value = "产品查询接口", httpMethod = "POST")
    @PostMapping(value = "product")
    public String successOrderMock( @RequestParam Map request){

        log.info(request.toString());

        String respone="{\"code\":\"0\",\"data\":[{\"foodid\":\"27\",\"foodimg\":\"https://www.sumzc.com/uploads/2021-01-26/2021012604063464291.jpg\",\"foodname\":\"燕麦拿铁\",\"medium_cup_original\":\"29.00\",\"foodprice\":\"25.5\"}],\"msg\":\"OK\"}";
        log.info(respone);
        Map result= JSONObject.parseObject(respone, Map.class);
//        log.info(result.toString());
        return respone;

    }
}
