package org.dao.impl;

import org.dao.SuperDao;
import org.dao.publishDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.articlePublishModel;
import org.springframework.stereotype.Repository;
import org.vo.ArticleEntity;
import org.vo.CollectEntity;
import org.vo.UserEntity;

import java.util.Set;

/**
 * Created by miaol on 2016/5/27 0027.
 */
@Repository
public class publishDaoImpl extends SuperDao implements publishDao
{
    @Override
    public boolean doPublish(UserEntity author, articlePublishModel articleToPublish)
    {
        Session session=this.getSessionFactory().openSession();
        Transaction tx=null;
        try{
            tx = session.beginTransaction();
            ArticleEntity article = new ArticleEntity();


            UserEntity authorP = (UserEntity) session.get(UserEntity.class, author.getUserid());
            article.setAuthor(authorP);

            article.setTitle(articleToPublish.getArticleTitle());
            article.setDownload(articleToPublish.getArticleDownloadUrl());
            article.setContent(articleToPublish.getArticleContent());
            article.setContext(articleToPublish.getArticleContext());
            article.setImageUrl(articleToPublish.getArticleImgPath());

            session.save(article);

            tx.commit();
        }
        catch (Exception e){
            if(tx!=null)
                tx.rollback();
            e.printStackTrace();
            return false;
        }
        finally {
            session.close();
        }

        return true;
    }

    @Override
    public void doDelete(int articleId)
    {
        Session session=this.getSessionFactory().openSession();
        Transaction tx=null;
        try{
            tx = session.beginTransaction();
            ArticleEntity article = (ArticleEntity) session.get(ArticleEntity.class, articleId);


            session.delete(article);

            tx.commit();
        }
        catch (Exception e){
            if(tx!=null)
                tx.rollback();
            e.printStackTrace();
        }
        finally {
            session.close();
        }

    }
}
