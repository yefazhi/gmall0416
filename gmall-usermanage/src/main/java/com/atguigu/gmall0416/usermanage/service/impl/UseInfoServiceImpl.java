package com.atguigu.gmall0416.usermanage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall0416.bean.UserAddress;
import com.atguigu.gmall0416.bean.UserInfo;
import com.atguigu.gmall0416.service.UserInfoService;
import com.atguigu.gmall0416.usermanage.mapper.UserAddressMapper;
import com.atguigu.gmall0416.usermanage.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class UseInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;
    @Override
    public List<UserInfo> findAll() {
       // List<UserInfo> listUser = userInfoMapper.selectAll();
        return userInfoMapper.selectAll();
    }
    @Override
    public List<UserAddress> getUserAddressList(String userId) {

        List<UserAddress> addressList = null;
        UserAddress userAddress = new UserAddress();
        userAddress.setUserAddress(userId);
        addressList = userAddressMapper.select(userAddress);
        return addressList;
    }

}
