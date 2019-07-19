package com.pzb.beetlpro.mapper;


import com.pzb.beetlpro.entity.UserPzb;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
@Mapper
public interface PzbMapper {

    public List<UserPzb> selectAll();
}
