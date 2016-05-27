package org.dao;

import org.model.articlePublishModel;
import org.vo.UserEntity;

/**
 * Created by miaol on 2016/5/27 0027.
 */
public interface publishDao
{
    boolean doPublish(UserEntity author, articlePublishModel articleToPublish);
    void doDelete(int articleId);
}
