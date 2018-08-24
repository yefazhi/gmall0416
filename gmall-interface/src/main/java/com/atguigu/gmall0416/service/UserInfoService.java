package com.atguigu.gmall0416.service;

import com.atguigu.gmall0416.bean.UserAddress;
import com.atguigu.gmall0416.bean.UserInfo;

import java.util.List;

public interface UserInfoService {

    //查询所有用户信息
    public List<UserInfo> findAll();

    //根据userid查询用户地址
    public List<UserAddress> getUserAddressList(String userId);
}