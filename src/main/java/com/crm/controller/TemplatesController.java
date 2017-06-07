package com.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zch on 2017/4/29.
 */
@Controller
@RequestMapping("/crm")
public class TemplatesController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/logout")
    public String logout() {
        return "logout";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}
