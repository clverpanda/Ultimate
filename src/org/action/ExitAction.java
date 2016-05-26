package org.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by wcy on 2016/5/26.
 */
public class ExitAction extends ActionSupport {
    public String execute() throws Exception{
        Map session = ActionContext.getContext().getSession();
        session.clear();
        return SUCCESS;
    }
}
