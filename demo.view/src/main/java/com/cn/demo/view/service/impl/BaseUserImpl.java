package com.cn.demo.view.service.impl;

import org.springframework.stereotype.Service;

import com.cn.demo.view.service.BaseUserService;

@Service
public class BaseUserImpl<BaseUser,K> extends BaseServiceImpl<BaseUser,java.lang.String> implements BaseUserService<BaseUser, K>{

}
