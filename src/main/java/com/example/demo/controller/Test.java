//package com.example.demo.controller;
//
//import com.example.demo.core.configurer.MybatisConfigurer;
//import com.example.demo.core.configurer.SpringConfig;
//import com.example.demo.service.UserInfoService;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class Test {
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(SpringConfig.class);
//        UserInfoService userInfoService = (UserInfoService) acac.getBean("userInfoService");
//        System.out.println(userInfoService.selectById(null));
//    }
//}
