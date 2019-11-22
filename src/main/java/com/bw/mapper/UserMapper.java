package com.bw.mapper;

import com.bw.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author yyl
 * @Date 2019/11/18 0018 上午 1:18
 * @Version 1.0
 */
public interface UserMapper {
    /**
     * 查询操作
     */
    //注解
   // @Select("SELECT * FROM Tb_user")
    List<User> findAll();

}
