package com.fanyx.SpringSecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/hello")
    @PreAuthorize("hasAuthority('system:test:list')")
    public String hello(){
        return "hello test";
    }

    @RequestMapping("/helloo")
    @PreAuthorize("hasAuthority('system:dept:list')")
    public String helloo(){
        return "hello dept";
    }

    @RequestMapping("/helloboss")
    @PreAuthorize("hasAuthority('system:boss:list')")
    public String helloboss(){
        return "hello boss";
    }

}
