package org.dao.impl;

import org.dao.SuperDao;
import org.dao.getArticleDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.vo.ArticleEntity;
import org.vo.UserEntity;

import java.util.List;

/**
 * Created by miaol on 2016/5/27 0027.
 */

@Repository
public class getArticleDaoImpl extends SuperDao implements getArticleDao
{
    @Override
    public List<ArticleEntity> doGetArticle()
    {
        Session session=this.getSessionFactory().openSession();
        Transaction tx=null;
        List<ArticleEntity> articleEntityList;
        try{
            tx = session.beginTransaction();
            Query query = session.createQuery("from ArticleEntity ");
            query.setMaxResults(9);
            articleEntityList = (List<ArticleEntity>) query.list();
            tx.commit();
        }
        catch (Exception e){
            if(tx!=null)
                tx.rollback();
            e.printStackTrace();
            return null;
        }
        finally {
            session.close();
        }


        return articleEntityList;
    }

    @Override
    public ArticleEntity doGetSpecificArticle(int articleId)
    {
        Session session=this.getSessionFactory().openSession();
        Transaction tx=null;
        ArticleEntity article;

        try{
            tx = session.beginTransaction();
            article = (ArticleEntity) session.get(ArticleEntity.class, articleId);

            tx.commit();
        }
        catch (Exception e){
            if(tx!=null)
                tx.rollback();
            e.printStackTrace();
            return null;
        }
        finally {
            session.close();
        }


        return article;
    }
}
