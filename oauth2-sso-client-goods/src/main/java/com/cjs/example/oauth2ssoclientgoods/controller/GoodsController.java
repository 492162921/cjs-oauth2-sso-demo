package com.cjs.example.oauth2ssoclientgoods.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Tan Dan
 * @Describe: AUTO
 * @PackageName:com.cjs.example.oauth2ssoclientgoods.controller
 * @create: 2022-06-01 15:31
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

    @GetMapping("/me")
    @ResponseBody
    public Authentication me(Authentication authentication) {
        return authentication;
    }

}
