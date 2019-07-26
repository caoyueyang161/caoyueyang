package com.czxy.dao;

import com.czxy.domain.Metting;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface MettingMapper extends Mapper<Metting> {

    @Select("SELECT * FROM tab_metting WHERE STATUS='未开始' ")
//    @Results({
//            @Result(property = "room_id",one = @One(select = "com.czxy.dao.MettingMapper.selectByPrimaryKey()"),column = "room_id")
//    })
    public List<Metting>findAll();

    @Select("SELECT * FROM tab_metting WHERE username=#{username}")
    public List<Metting>findusernameAll(@Param("username")String username);
}
