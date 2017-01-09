package com.leipeng.spring.hessian.service.impl;

import com.leipeng.spring.hessian.service.HessianInterface;

/**
 * Created by leipeng on 2017/1/9.
 */
public class HessianServiceImpl implements HessianInterface {
    public String helloworld() {
        return "hello world";
    }

    public String sayHelloTo(String name) {
        return "hello: " + name;
    }
}
