package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by xyr on 2017/10/13.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String helloHtml(Map<String, String> map) {
        map.put("name", "world");
        return "hello";
    }

}
