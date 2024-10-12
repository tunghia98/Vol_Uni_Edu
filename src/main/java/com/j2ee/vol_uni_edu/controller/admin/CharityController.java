package com.j2ee.vol_uni_edu.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CharityController {
    @RequestMapping("admin/charity")
    public String Charity(){
        return "admin/charity";
    }
}
