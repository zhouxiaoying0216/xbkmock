package com.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Api(description = "接口文档")
@RestController
@Slf4j
public class SuccessQueryMock {

    @ApiOperation(value = "查询结果接口", httpMethod = "GET")
    @GetMapping(value = "/query")
    public String successQueryMock(@RequestParam Map request){
//          int orderid;
//        log.info(request);

        String respone="{\"code\":\"0\",\"data\":{\"order\":[{\"order_no\":\"202202221575\",\"orderid\":\"111136\",\"foodimg\":\"https://www.laoluo100.com/gLD_management/./upload/2021-01-26/2021012604063464291.jpg\",\"phone\":\"12000000021\",\"openid\":\"123\",\"foodid\":\"27\",\"finish_order_time\":\"1632643897\",\"proname\":\"燕麦拿铁\",\"order_time\":\"1632643897\",\"state\":\"0\"},{\"order_no\":\"202202221575\",\"orderid\":\"111137\",\"foodimg\":\"https://www.laoluo100.com/gLD_management/./upload/2021-01-26/2021012604063464292.jpg\",\"phone\":\"12000000021\",\"openid\":\"123\",\"foodid\":\"27\",\"finish_order_time\":\"1632643897\",\"proname\":\"燕麦拿铁\",\"order_time\":\"1632643897\",\"state\":\"0\"}],\"total\":2},\"msg\":\"OK\"}";
//        String respone="{\"code\":\"0\",\"data\":{\"order\":[{\"order_no\":\"202202221550\",\"orderid\":\"14037\",\"foodimg\":\"https://www.laoluo100.com/gLD_management/./upload/2021-01-26/2021012604112089118.jpg\",\"phone\":\"15001030536\",\"openid\":\"1XNjKrK0g6c7WhRLH2Gf\",\"foodid\":\"27\",\"finish_order_time\":\"1637313552\",\"proname\":\"燕麦拿铁\",\"order_time\":\"1637313552\",\"state\":\"0\"},{\"order_no\":\"20211119000001\",\"orderid\":\"14018\",\"foodimg\":\"https://www.laoluo100.com/gLD_management/./upload/2021-01-26/2021012604112089118.jpg\",\"phone\":\"15001030536\",\"openid\":\"1XNjKrK0g6c7WhRLH2Gf\",\"foodid\":\"32\",\"finish_order_time\":\"1637313552\",\"proname\":\"摩卡（中杯）\",\"order_time\":\"1637313552\",\"state\":\"0\"},{\"order_no\":\"20211119000001\",\"orderid\":\"14019\",\"foodimg\":\"https://www.laoluo100.com/gLD_management/./upload/2021-01-26/2021012604112089118.jpg\",\"phone\":\"15001030536\",\"openid\":\"1XNjKrK0g6c7WhRLH2Gf\",\"foodid\":\"32\",\"finish_order_time\":\"1637313552\",\"proname\":\"摩卡（中杯）\",\"order_time\":\"1637313552\",\"state\":\"0\"},{\"order_no\":\"20211119000001\",\"orderid\":\"14025\",\"foodimg\":\"https://www.laoluo100.com/gLD_management/./upload/2021-01-26/2021012604112089118.jpg\",\"phone\":\"15001030536\",\"openid\":\"1XNjKrK0g6c7WhRLH2Gf\",\"foodid\":\"32\",\"finish_order_time\":\"1637313552\",\"proname\":\"摩卡（中杯）\",\"order_time\":\"1637313552\",\"state\":\"0\"},{\"order_no\":\"20211119000001\",\"orderid\":\"14036\",\"foodimg\":\"https://www.laoluo100.com/gLD_management/./upload/2021-01-26/2021012604112089118.jpg\",\"phone\":\"15001030536\",\"openid\":\"1XNjKrK0g6c7WhRLH2Gf\",\"foodid\":\"32\",\"finish_order_time\":\"1637313552\",\"proname\":\"摩卡（中杯）\",\"order_time\":\"1637313552\",\"state\":\"0\"}],\"total\":5},\"msg\":\"OK\"}";
        log.info(respone);
//        Map result= JSONObject.parseObject(respone, Map.class);
//        log.info(result.toString());
        return respone;


    }
}
