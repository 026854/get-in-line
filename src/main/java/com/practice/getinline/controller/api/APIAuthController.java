package com.practice.getinline.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
//@RestController 를 사용하면 뷰를 찾는게 아니라 데이터 그대로를 내려보네준다.
@RestController
public class APIAuthController {

    @GetMapping("/sign-up")
    public String signUp(){
        return "done.";
    }

    @GetMapping("/login")
    public String login(){
        return "done.";
    }
}
