package org.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.service.ArticleService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by wcy on 2016/5/26.
 */
@Controller
public class InitializeAction extends ActionSupport {

    @Resource
    private ArticleService articleService;
    public String execute(){
        List list=this.articleService.getArticle();
        Map session= ActionContext.getContext().getSession();
        session.put("all",list);
        return SUCCESS;
    }
}
