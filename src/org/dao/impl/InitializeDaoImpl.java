package org.dao.impl;

import org.dao.InitializeDao;
import org.dao.SuperDao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wcy on 2016/5/26.
 */
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository

public class InitializeDaoImpl extends SuperDao implements InitializeDao{
    @Override
    public List getArticle(){
        Session session=this.getSessionFactory().openSession();
        Transaction tx=null;
        List list=new ArrayList();
        try{
            tx=session.beginTransaction();
            Query query=session.createQuery("from ArticleEntity");
            list=query.list();
            tx.commit();
        }
        catch (Exception e){
            if(tx!=null)
                tx.rollback();
            e.printStackTrace();
        }

        return list;
    }
}
