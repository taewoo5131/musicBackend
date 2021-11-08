package com.music.musicBackend.login.mapper;

import java.util.HashMap;
import java.util.Map;

public interface LoginMapper {

    int loginCheck(Map<String, Object> param);
}
