package com.gzj.test;

import com.gzj.bean.JaveBean;

/**
 * Created by admin on 2017/1/12.
 */
public class MainTest {
    public static void main(String[] args) {
        JaveBean bean = new JaveBean();
        bean.setId(1);
        bean.setSex("女");
        bean.setUserName("gesujie");

        System.out.println(bean.toString());

    }


}
