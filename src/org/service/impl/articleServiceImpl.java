package org.service.impl;

import org.dao.getArticleDao;
import org.dao.publishDao;
import org.model.articlePublishModel;
import org.model.articleViewModel;
import org.model.indexViewModel;
import org.service.articleService;
import org.springframework.stereotype.Service;
import org.vo.ArticleEntity;
import org.vo.UserEntity;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by miaol on 2016/5/27 0027.
 */
@Service
public class articleServiceImpl implements articleService
{
    @Resource
    private publishDao publishDao;
    @Resource
    private getArticleDao getArticleDao;

    @Override
    public boolean publishArticle(UserEntity author, articlePublishModel article)
    {
        return this.publishDao.doPublish(author, article);
    }

    @Override
    public List<indexViewModel> getIndexArticles()
    {
        List<indexViewModel> indexViewModelList = new ArrayList<>();
        for (ArticleEntity article:getArticleDao.doGetArticle())
        {
            indexViewModel tempIndexViewModel = new indexViewModel();
            tempIndexViewModel.setArticleTitle(article.getTitle());
            tempIndexViewModel.setArticleAuthor(article.getAuthor().getUsername());
            tempIndexViewModel.setArticleImgPath(article.getImageUrl());
            tempIndexViewModel.setArticlePublishDate(article.getPublishtime().toString());
            tempIndexViewModel.setArticleCommentCount(0);
            tempIndexViewModel.setCollected(false);
            tempIndexViewModel.setArticleLabel("");
            tempIndexViewModel.setArticleId(article.getArticleId());
            indexViewModelList.add(tempIndexViewModel);
        }
        return indexViewModelList;
    }

    @Override
    public articleViewModel getArticle(int articleId)
    {
        ArticleEntity article = getArticleDao.doGetSpecificArticle(articleId);
        articleViewModel articleView = new articleViewModel();
        articleView.setArticleTitle(article.getTitle());
        articleView.setArticleContent(article.getContent());
        articleView.setArticlePublishTime(article.getPublishtime().toString());
        articleView.setArticleAuthor(article.getAuthor().getUsername());
        return articleView;
    }

    @Override
    public List<indexViewModel> getPersonalArticles(int userId)
    {
        List<indexViewModel> indexViewModelList = new ArrayList<>();
        for (ArticleEntity article:getArticleDao.doGetArticle())
        {
            if (article.getAuthor().getUserid() == userId) {
                indexViewModel tempIndexViewModel = new indexViewModel();
                tempIndexViewModel.setArticleTitle(article.getTitle());
                tempIndexViewModel.setArticleAuthor(article.getAuthor().getUsername());
                tempIndexViewModel.setArticleImgPath(article.getImageUrl());
                tempIndexViewModel.setArticlePublishDate(article.getPublishtime().toString());
                tempIndexViewModel.setArticleCommentCount(0);
                tempIndexViewModel.setCollected(false);
                tempIndexViewModel.setArticleLabel("");
                tempIndexViewModel.setArticleId(article.getArticleId());
                indexViewModelList.add(tempIndexViewModel);
            }
        }
        return indexViewModelList;
    }

    @Override
    public void deleteArticle(int articleId)
    {
        publishDao.doDelete(articleId);
    }
}
