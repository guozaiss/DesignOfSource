package com.example.guozaiss.state;

import android.content.Context;

/**
 * Created by guozaiss on 16/1/21.
 * 用户登录状态管理类
 */
public class LoginContext {
    //用户状态，默认是未登录状态
    UserState userState=new LogoutState();

    //单例对象
    static LoginContext loginContext=new LoginContext();

    private LoginContext(){

    }

    public static LoginContext getInstance(){
        return loginContext;
    }

    /**
     * 获得用户状态
     * @return
     */
    public UserState getUserState() {
        return userState;
    }

    /**
     * 设置用户状态
     * @param userState
     */
    public void setUserState(UserState userState) {
        this.userState = userState;
    }

    /**
     * 转发（托管）
     * @param context
     */
    public void forward(Context context) {
        userState.forward(context);
    }

    /**
     * 评论（托管）
     * @param context
     */
    public void commit(Context context) {
        userState.commit(context);
    }
}
