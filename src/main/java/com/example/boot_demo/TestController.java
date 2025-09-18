package com.example.boot_demo;
//這層寫Api
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//提供的是restApi controller
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
    @GetMapping("/good")
    public List<String> good(){

        return List.of("hello,world");
    }
}
