package com.leipeng.spring.hessian;

import com.caucho.hessian.client.HessianProxy;
import com.caucho.hessian.client.HessianProxyFactory;
import com.leipeng.spring.hessian.service.HessianInterface;

import java.net.MalformedURLException;

/**
 * Created by leipeng on 2017/1/9.
 */
public class Main {
    public static void main(String[] args) {
        String url = "http://127.0.0.1:8000/hessian";
        HessianProxyFactory factory = new HessianProxyFactory();
        HessianInterface service = null;
        try {
            service = (HessianInterface) factory.create(HessianInterface.class, url);
            System.out.println(service.sayHelloTo("leipeng"));
            System.out.println(service.helloworld());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
