//package com.example.demo.core.configurer;
//
//import com.example.demo.dao.UserInfoMapper;
//import com.example.demo.service.UserInfoService;
//import com.example.demo.service.impl.UserInfoServiceImpl;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration// 通过注解来表明该类是一个Spring的配置，相当于一个xml文件
//public class SpringConfig {
//    @Bean// 这里要注意,方法名"getUserDao"将作为UserDao在容器中的id
//    public UserInfoMapper getUserInfoMapper() {
//        return new UserInfoMapper();
//    }
//}
//123