package org.service.impl;

import org.dao.CollectDao;
import org.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wcy on 2016/5/27.
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private CollectDao collectDao;
    @Override
    public boolean collectArticle(int userId,int articleId){
        return this.collectDao.collectArticle(userId,articleId);
    }
}
