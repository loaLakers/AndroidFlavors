package com.wzh.androidflavors;

/**
 * @author wr
 * @version V1.0
 * @date 2017-07-19 上午10:07
 * @desc 登陆正式环境版
 **/
public class ModuleManager {

    public static String login(String username, String password) {

        String result;
        if (username.equals("test") && password.equals("test")) {

            result = "Prod版本登陆成功！";
        } else {

            result = "用户名或者密码错误，请检查后重试！";
        }

        return result;
    }
}
