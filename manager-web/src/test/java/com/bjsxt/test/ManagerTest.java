package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//使用junit做测试
@RunWith(SpringJUnit4ClassRunner.class)
//加载配置文件,使用mapper去测
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")

//测试spring和mybatis的整合
public class ManagerTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUserTest(){
        Users users = new Users();
        users.setUserage(12);
        users.setUsername("admin");
        this.usersMapper.insertUser(users);


    }

}
