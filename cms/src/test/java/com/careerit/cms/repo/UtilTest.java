package com.careerit.cms.repo;

import com.careerit.cms.config.JwtUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

@SpringBootTest
public class UtilTest {

    @Autowired
    private JwtUtil jwtUtil;

    @Test
    void generateTokenTest(){
        UserDetails userDetails = User.builder().username("krish")
            .password("krish")
            .roles("USER")
            .build();
        String token = jwtUtil.generateToken(userDetails);
        System.out.println(token);
    }
}
