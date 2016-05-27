package org.service.impl;

import org.dao.InitializeDao;
import org.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wcy on 2016/5/26.
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private InitializeDao initializeDao;

    @Override
    public List getArticle(){
        return this.initializeDao.getArticle();
    }
}
