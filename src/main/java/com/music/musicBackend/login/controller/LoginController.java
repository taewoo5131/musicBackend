package com.music.musicBackend.login.controller;

import com.music.musicBackend.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public int login(@RequestParam HashMap<String,Object> paramMap) throws Exception{
        int result = loginService.loginCheck(paramMap);
        System.out.println("login!!!!");
        return result;
    }
}
