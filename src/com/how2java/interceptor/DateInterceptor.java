package com.how2java.interceptor;

import com.how2java.action.ProductAction;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        ProductAction action = (ProductAction) actionInvocation.getAction();
        action.setDate(new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(new Date()));
        return actionInvocation.invoke();
    }
}
