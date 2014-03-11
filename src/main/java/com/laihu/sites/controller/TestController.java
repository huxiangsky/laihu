package com.laihu.sites.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: johnny
 * Date: 13-8-24
 * Time: 下午4:27
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class TestController {
    @RequestMapping("/console/test")
    public String test(){
        return "console/test";
    }
}
