package com.fanyx.SpringSecurity.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fanyx.SpringSecurity.pojo.Menu;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MenuMapper extends BaseMapper<Menu> {
    List<String> selectPermsByUserId(Long id);
}
