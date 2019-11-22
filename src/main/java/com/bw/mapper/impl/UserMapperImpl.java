package com.bw.mapper.impl;

import com.bw.domain.User;
import com.bw.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @Author yyl
 * @Date 2019/11/22 0022 下午 11:08
 * @Version 1.0
 */
public class UserMapperImpl implements UserMapper {
    private SqlSessionFactory factory;
    public UserMapperImpl (SqlSessionFactory factory){
        this.factory=factory;
    }
    public List<User> findAll(){
        //1.使用工厂创建SqlSession对象
        SqlSession session = factory.openSession();
        //2.使用session执行查询方法
        List<User> users = session.selectList( "com.bw.mapper.UserMapper.findAll");
        session.close();
        return users;
    }
}
