package com.one.mapper;

import com.one.model.UserMybatis;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMybatisMapper {

     // 用注解的方式
     @Select("select * from User where id = #{id}")
     UserMybatis selectUserById(String id);

     // 用xml的方式
     List<UserMybatis> selectUserS();

}
