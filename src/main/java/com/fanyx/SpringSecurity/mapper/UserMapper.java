package com.fanyx.SpringSecurity.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fanyx.SpringSecurity.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public interface UserMapper extends BaseMapper<User> {
}


