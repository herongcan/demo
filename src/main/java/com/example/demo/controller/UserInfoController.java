package com.example.demo.controller;

import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 张瑶
 * @Description:
 * @time 2018/4/18 11:39
 */
@RestController
@RequestMapping("userInfo")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello SpringBoot";
    }

    @RequestMapping("/selectById")
    public List<UserInfo> selectById(Integer id){
        List<UserInfo> userInfos = userInfoService.selectById(id);
        return userInfos;
    }
}