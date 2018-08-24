package com.atguigu.gmall0416.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0416.bean.UserAddress;
import com.atguigu.gmall0416.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class OrderController {

    @Reference
    UserInfoService userInfoService;

    @GetMapping("trade")
    public List<UserAddress> getUserAddress(String userId){
        List<UserAddress> userAddressList = userInfoService.getUserAddressList(userId);
        UserAddress userAddress = new UserAddress();
        userAddress.setUserAddress("shanghai");
        userAddressList.add(userAddress);
        return userAddressList;
    }




}
