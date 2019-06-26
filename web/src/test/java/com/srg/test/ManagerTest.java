package com.srg.test;

import com.srg.dao.UserDao;
import com.srg.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-context.xml")
public class ManagerTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void  insertUserTest(){
        User user=new User();
        user.setLoginacct("songrengui");
        user.setUsername("宋任桂");
        user.setUserpswd("111");
        user.setCreatetime(null);
        user.setEmail(null);
        this.userDao.saveUser(user);
    }
}
