package sbs.toutiao.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello,Spring boot!";
    }

    //带参数
    @RequestMapping("/world/{name}")
    public String word(@PathVariable String name) {
        return "word--spring boot:" + name;
    }
}