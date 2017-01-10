package com.leipeng.spring.hessian.service;

import com.leipeng.spring.hessian.model.Model;

/**
 * Created by leipeng on 2017/1/9.
 */
public interface HessianInterface {
    String helloworld();

    String sayHelloTo(String name);
    
    String info(Model model, String extra);
}
