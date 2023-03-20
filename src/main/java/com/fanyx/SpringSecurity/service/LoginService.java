package com.fanyx.SpringSecurity.service;

import com.fanyx.SpringSecurity.pojo.ResponseResult;
import com.fanyx.SpringSecurity.pojo.User;

public interface LoginService {
    public ResponseResult login(User user);
    public ResponseResult logout();
}
