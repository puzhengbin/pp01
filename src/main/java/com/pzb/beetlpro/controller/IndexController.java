package com.pzb.beetlpro.controller;



import com.github.pagehelper.PageInfo;
import com.pzb.beetlpro.entity.UserPzb;
import com.pzb.beetlpro.service.PzbService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller

public class IndexController {
    @Autowired
    private PzbService pzbService;



    @RequestMapping("/index")
    public String index(ModelMap modelMap) {
        modelMap.put("userName", "Tom+JerrySS");
        modelMap.put("titleLab", "这是一个大标题");
        List<UserPzb> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            UserPzb userPzb = new UserPzb();
            userPzb.setAge(18);
            userPzb.setEmail("p" + i);

        }



        return "index";
    }

    @RequestMapping("/getPzbList")
    @ResponseBody
    public PageInfo getPzbs() {
        return pzbService.getAllUser();
    }
}
