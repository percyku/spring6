package com.percy.spring6.junit.junit4;


import com.percy.spring6.junit.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean.xml")
public class TestJunit4 {
    //注入
    @Autowired
    private User user;

    //測試
    @Test
    public void test(){
        System.out.println(user);
        user.run();
    }

}
