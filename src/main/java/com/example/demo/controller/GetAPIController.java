package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GetAPIController {
    @GetMapping("api")
    public String getRequest(@RequestParam(name = "id", required = false) String userId,
            @RequestParam(name = "password", required = false) String password) {
        if (userId == null || password == null) {
            return "유저의 아이디 또는 패스워드가 필요합니다.!";
        }
        return userId + "유저 아이디는 이거고" + password + "패스워드는 이거임";
    }

    @PostMapping("api")
    public String postRequest(@RequestBody Map<String, String> myBody) {

        System.out.println(myBody.get("name"));
        System.out.println(myBody.get("password"));

        return "이거 성공합니다";
    }

}
