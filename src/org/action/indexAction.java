package org.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.model.indexViewModel;
import org.service.articleService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by miaol on 2016/5/27 0027.
 */
public class indexAction extends ActionSupport implements ModelDriven
{
    private List<indexViewModel> indexViewModels;
    @Resource
    articleService articleService;

    @Override
    public Object getModel()
    {
        if (indexViewModels == null)
            indexViewModels = new ArrayList<>();
        return indexViewModels;
    }

    @Override
    public String execute()
    {
        this.indexViewModels = this.articleService.getIndexArticles();
        return SUCCESS;
    }

    public List<indexViewModel> getIndexViewModels() {
        return indexViewModels;
    }

    public void setIndexViewModels(List<indexViewModel> indexViewModels) {
        this.indexViewModels = indexViewModels;
    }
}
