package com.bw.test;

import com.bw.domain.User;
import com.bw.mapper.UserMapper;
import com.bw.mapper.impl.UserMapperImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author yyl
 * @Date 2019/11/18 0018 下午 10:00
 * @Version 1.0
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder ss = new SqlSessionFactoryBuilder();
        SqlSessionFactory sf = ss.build(in);
        //3.使用工厂生产SqlSession对象
        UserMapper userMapper = new UserMapperImpl(sf);
        //4.使用代理对象执行方法
        List<User> users = userMapper.findAll();
        for(User user : users){
            System.out.println(user);
        }
        in.close();
    }
}
