package org.service;

import org.model.articlePublishModel;
import org.model.articleViewModel;
import org.model.indexViewModel;
import org.vo.UserEntity;

import java.util.List;

/**
 * Created by miaol on 2016/5/27 0027.
 */
public interface articleService
{
    boolean publishArticle(UserEntity author, articlePublishModel article);
    List<indexViewModel> getIndexArticles();
    articleViewModel getArticle(int articleId);
    List<indexViewModel> getPersonalArticles(int userId);
    void deleteArticle(int articleId);
}
