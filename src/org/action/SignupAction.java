package org.action;

/**
 * Created by wcy on 2016/5/26.
 */
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.model.SignModel;
import org.service.SignService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
@Controller
public class SignupAction extends ActionSupport implements ModelDriven{

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
        if(this.signService.signUp(user.getUsername(),user.getPassword()))
            return SUCCESS;
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
