package com.stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    /**
     * 测试接口
     *
     * @return
     */
    @GetMapping ("/world")
    public String hello() {
        return "Hello World";
    }
}
