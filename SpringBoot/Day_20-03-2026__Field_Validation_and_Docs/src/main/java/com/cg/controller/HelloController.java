package com.cg.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController                  // RestController = Controller + response body
//@Controller
public class HelloController {

//    @GetMapping("hello")
//    public String sayHello() {
//        return "Hello.html";
//    }


//    @GetMapping("hello")
//    public @ResponseBody String sayHello() {
//        return "Hello";
//    }


    @GetMapping("abc/{n}")
    public String sayHello1(@PathVariable("n") String name){
        return "Hello from " + name;
    }
}
