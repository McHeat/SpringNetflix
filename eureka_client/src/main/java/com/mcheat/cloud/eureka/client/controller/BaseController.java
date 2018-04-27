package com.mcheat.cloud.eureka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author McHeat
 * @date 2018/4/27
 */
@RestController
public class BaseController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String init() {
        return "Hello, Eureka Client";
    }

}
