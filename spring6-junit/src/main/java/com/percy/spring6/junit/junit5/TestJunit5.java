package com.percy.spring6.junit.junit5;

import com.percy.spring6.junit.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
//較少用
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean.xml")
//比較常見
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class TestJunit5 {

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
