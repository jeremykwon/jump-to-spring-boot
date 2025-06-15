package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//@RestController  // 문자열 응답을 위한 컨트롤러
@Controller
public class HelloController {
    @GetMapping("/")  // http://localhost:8080 으로 접속 시 실행됨
    @ResponseBody // Controller 어노테이션을 사용해 문자열을 내려주려면 해당 어노테이션 필요
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/test")  // http://localhost:8080 으로 접속 시 실행됨
    @ResponseBody // Controller 어노테이션을 사용해 문자열을 내려주려면 해당 어노테이션 필요
    public String test() {
        return "test";
    }
}