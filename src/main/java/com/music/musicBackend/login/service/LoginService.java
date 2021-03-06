package com.music.musicBackend.login.service;

import com.music.musicBackend.login.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginService {

    @Autowired
    private LoginMapper loginMapper;

    public int loginCheck(Map<String, Object> param){
        int result = loginMapper.loginCheck(param);
        return result;
    }
}
