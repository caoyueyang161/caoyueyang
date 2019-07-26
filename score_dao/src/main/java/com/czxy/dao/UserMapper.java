package com.czxy.dao;


import com.czxy.domain.User;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {

    @Select("select * from tab_user where username=#{username} and password=#{password}")
    public User login(User user);


}
