package com.hld.util;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;

public class Jurisdiction {

    public static Session getSession() {
        // Subject currentUser = SecurityUtils.getSubject();
        return SecurityUtils.getSubject().getSession();
    }
    public static Object getUser() {
        return getSession().getAttribute(Const.SESSION_USERROL);
    }
}
