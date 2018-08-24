package com.atguigu.gmall0416.usermanage.controller;

import com.atguigu.gmall0416.bean.UserAddress;
import com.atguigu.gmall0416.bean.UserInfo;
import com.atguigu.gmall0416.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("findAll")
    @ResponseBody
    public List<UserInfo> findAll(){
        List<UserInfo> userInfoList = userInfoService.findAll();
        return userInfoList;
    }

    @RequestMapping("trade")
    @ResponseBody
    public List<UserAddress> trade(HttpServletRequest request){
        String userId = request.getParameter("userId");
        List<UserAddress> addressList = userInfoService.getUserAddressList(userId);
        return addressList;
    }



}
