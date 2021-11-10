package com.music.musicBackend.login.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.Map;

@Mapper
public interface LoginMapper {

    int loginCheck(Map<String, Object> param);
}
