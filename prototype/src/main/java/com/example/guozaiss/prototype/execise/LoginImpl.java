package com.example.guozaiss.prototype.execise;

/**
 * Created by guozaiss on 16/1/20.
 */
public class LoginImpl implements login {
    @Override
    public void login() {
        //登陆到服务器
        User loginedUser =new User();
        loginedUser.age=22;
        loginedUser.name="xiaoming";
        loginedUser.address = new Address("河南", "接口ij", "黄河大道");

        /**
         *
         */
    }
}
