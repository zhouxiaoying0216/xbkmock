package com.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.config.SignUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.Map;

@Api(description = "接口文档")
@RestController
@Slf4j
public class SuccessQueryoMock {

    @ApiOperation(value = "券码激活接口", httpMethod = "POST")
    @PostMapping(value = "/queryo")
    public String successOrderoMock(@RequestParam Map request){
        log.info(request.toString());
        String str = JSON.toJSONString(request);
        log.info(str);
       JSONObject jsonObject= JSONObject.parseObject(str);
//
        String orderid=jsonObject.getString("orderid");

 //       log.info(request.toString());
        log.info("获取的orderid"+orderid);

        switch (orderid){
            case "111130":
                String respone="{\"code\":\"1\",\"data\":\"\",\"msg\":\"库存量不足\"}";
                log.info(respone);
                Map result=JSONObject.parseObject(respone, Map.class);
//        log.info(result.toString());
                return respone;
            default:
                 String respone1="{\"code\":\"0\",\"data\":\"http://test-img0.qianbao.com/27,3bdab492eba037\",\"msg\":\"OK\"}";
                 log.info(respone1);
                 Map result1=JSONObject.parseObject(respone1, Map.class);
//        log.info(result.toString());
                 return respone1;
        }
//        String respone="{\"code\":\"0\",\"data\":\"https://www.laoluo100.com/new_index/./upload/a/20210923/202109231632407530347.png\",\"msg\":\"OK\"}";
//        log.info(respone);
//        Map result=JSONObject.parseObject(respone, Map.class);
////        log.info(result.toString());
//        return respone;

    }
}
