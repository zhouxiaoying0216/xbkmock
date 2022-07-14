package com.controller;


import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Api(description = "接口文档")
@RestController
@RequestMapping(value = "/")
@Slf4j
public class SuccesssOrderMock {

    @ApiOperation(value = "下单接口", httpMethod = "POST")
    @PostMapping(value = "order")
    public String successOrderMock( @RequestParam Map request){

        log.info(request.toString());

        String respone="{\"code\":\"0\",\"msg\":\"OK\"}";
        log.info(respone);
        Map result= JSONObject.parseObject(respone, Map.class);
//        log.info(result.toString());
        return respone;

    }


}
