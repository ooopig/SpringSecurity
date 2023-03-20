package com.fanyx.SpringSecurity.pojo.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fanyx.SpringSecurity.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import sun.security.timestamp.TSRequest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @Author 三更  B站： https://space.bilibili.com/663528522
 */
@Data
@NoArgsConstructor
public class LoginUser implements UserDetails {

    private User user;

    @JSONField(serialize = false)
    private List<GrantedAuthority> authorities;

    private List<String>permissions;

    public LoginUser(User user, List<String> permissions) {
        this.user = user;
        this.permissions = permissions;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(Objects.isNull(this.authorities)){
            authorities = permissions.stream()
                    .map(SimpleGrantedAuthority::new)
                    .collect(Collectors.toList());
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

