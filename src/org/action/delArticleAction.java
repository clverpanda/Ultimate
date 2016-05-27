package org.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.service.articleService;

import javax.annotation.Resource;

/**
 * Created by miaol on 2016/5/27 0027.
 */
public class delArticleAction extends ActionSupport
{
    private int articleId;

    @Resource
    articleService articleService;

    @Override
    public String execute()
    {
        this.articleService.deleteArticle(articleId);
        return SUCCESS;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }
}
