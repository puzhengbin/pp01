package com.pzb.beetlpro.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pzb.beetlpro.entity.UserPzb;
import com.pzb.beetlpro.mapper.PzbMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PzbService {

    @Autowired
    private PzbMapper pzbMapper;

    public PageInfo getAllUser() {

        PageInfo<UserPzb> pzbPageInfo = PageHelper.startPage(1, 3).doSelectPageInfo(() -> {
            pzbMapper.selectAll();
        });


        return pzbPageInfo;
    }
}
