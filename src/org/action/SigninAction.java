package org.action;

/**
 * Created by wcy on 2016/5/24.
 */
import org.vo.UserEntity;
import org.service.SignService;
import com.opensymphony.xwork2.*;
import org.model.*;


import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.Map;
@Controller
public class SigninAction extends ActionSupport implements ModelDriven{
    private SignModel user;

    @Override
    public Object getModel()
    {
        if (user == null)
            user = new SignModel();
        return user;
    }

    @Resource
    private SignService signService;

    @Override
    public String execute() throws Exception
    {
        UserEntity u = this.signService.checkSignin(user.getUsername(),user.getPassword());
        if(u!=null) {
            Map session = ActionContext.getContext().getSession();
            session.put("user",u);
            return SUCCESS;
        }
        else
            return ERROR;
    }


    public SignModel getUser() {
        return user;
    }

    public void setUser(SignModel user){
        this.user=user;
    }
}
