package org.dao.impl;

import org.dao.CollectDao;
import org.dao.SuperDao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.vo.CollectEntity;
import org.vo.UserEntity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wcy on 2016/5/27.
 */
@Repository
public class CollectDaoImpl extends SuperDao implements CollectDao {
    @Override
    public boolean collectArticle(int userId,int articleId){
        Session session=this.getSessionFactory().openSession();
        Transaction tx=null;
        UserEntity user=null;
        CollectEntity collect=null;
        try{
            tx=session.beginTransaction();
            user.setUserid(userId);
            collect.setArticleId(articleId);
            Set collects=new HashSet();
            collects.add(collect);
            user.setCollects(collects);
            session.update(user);
            tx.commit();

        }
        catch (Exception e){
            if(tx!=null)
                tx.rollback();
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
