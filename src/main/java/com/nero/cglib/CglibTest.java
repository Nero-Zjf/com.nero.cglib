package com.nero.cglib;

public class CglibTest {
    public static void main(String[] args) {
        UserService target = new UserService();
        UserServiceProxy proxyFactory = new UserServiceProxy(target);
        UserService proxy = (UserService)proxyFactory.getProxyInstance();

        System.out.println("代理对象：" + proxy.getClass());

        System.out.println(proxy.getName());
    }
}
