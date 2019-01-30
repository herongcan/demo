package com.example.demo.service;

import com.example.demo.model.UserInfo;

import java.util.List;

/**
 * @author 张瑶
 * @Description:
 * @time 2018/4/18 11:56
 */
public interface UserInfoService {

    List<UserInfo> selectById(Integer id);

}