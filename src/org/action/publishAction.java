package org.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.model.articlePublishModel;
import org.service.articleService;
import org.vo.UserEntity;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by miaol on 2016/5/27 0027.
 */
public class publishAction extends ActionSupport implements ModelDriven
{
    private articlePublishModel article;

    @Resource
    private articleService articleService;

    @Override
    public Object getModel()
    {
        if (article == null)
            article = new articlePublishModel();
        return article;
    }

    @Override
    public String execute()
    {
        Map session = ActionContext.getContext().getSession();
        UserEntity user = (UserEntity) session.get("user");
        if (user == null)
            return ERROR;
        else if (this.articleService.publishArticle(user, article))
            return SUCCESS;
        else
            return ERROR;
    }

    public articlePublishModel getArticle() {
        return article;
    }

    public void setArticle(articlePublishModel article) {
        this.article = article;
    }
}
