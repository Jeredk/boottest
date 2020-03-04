package com.example.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.BoardMapper;
import com.example.demo.dao.UserMapper;
import com.example.demo.dto.BoardDto;
import com.example.demo.dto.UserDto;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
 
    @Autowired
    private UserMapper uMapper;
    @Autowired
    private BoardMapper bMapper;
    
    @Test
    public void userTest() {
        UserDto user = new UserDto();
        user.setUserId("test");
        user.setUserPw("test");
        user.setUserName("테스트");
        user.setUserGender("남");
        user.setUserEmail("test@test.test");
        uMapper.insertUser(user);
        
        System.out.println(uMapper.selectOneUser("test"));
    }
    
    @Test
    public void boardTest() {
        BoardDto board = new BoardDto();
        board.setPassword("1234");
        board.setWriter("test");
        bMapper.insertBoard(board);
        
        System.out.println(bMapper.selectOneBoard(1));
    }

}
