package org.model;

/**
 * Created by miaol on 2016/5/27 0027.
 */
public class articleViewModel
{
    private String articleTitle;
    private String articlePublishTime;
    private String articleContent;
    private String articleAuthor;

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public String getArticlePublishTime() {
        return articlePublishTime;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public void setArticlePublishTime(String articlePublishTime) {
        this.articlePublishTime = articlePublishTime;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }
}
