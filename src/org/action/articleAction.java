package org.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.model.articleViewModel;
import org.service.articleService;

import javax.annotation.Resource;

/**
 * Created by miaol on 2016/5/27 0027.
 */
public class articleAction extends ActionSupport implements ModelDriven
{
    private articleViewModel article;
    private int articleId;
    @Resource
    articleService articleService;
    @Override
    public Object getModel()
    {
        if (article == null)
            this.article = new articleViewModel();
        return  article;
    }

    @Override
    public String execute()
    {
        this.article = this.articleService.getArticle(articleId);
        return SUCCESS;
    }

    public articleViewModel getArticle() {
        return article;
    }

    public void setArticle(articleViewModel article) {
        this.article = article;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }
}
