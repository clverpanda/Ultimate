package org.dao;

import org.vo.ArticleEntity;

import java.util.List;

/**
 * Created by miaol on 2016/5/27 0027.
 */
public interface getArticleDao
{
    List<ArticleEntity> doGetArticle();
    ArticleEntity doGetSpecificArticle(int articleId);
}
