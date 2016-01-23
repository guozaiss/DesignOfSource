package com.example.guozaiss.prototype.execise;

/**
 * Created by guozaiss on 16/1/20.
 * 用户登陆类不应该被外部访问，所以进行保护性拷贝
 */
public class LoginSession {
    static LoginSession loginSession=null;
    private User user;
    private LoginSession(){

    }
    public LoginSession getLoginSession() {
        if (loginSession == null) {
            synchronized (LoginSession.class) {
                if (loginSession == null) {
                    loginSession=new LoginSession();
                }
            }
        }
        return loginSession;
    }

    protected void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user.clone();
    }
}
