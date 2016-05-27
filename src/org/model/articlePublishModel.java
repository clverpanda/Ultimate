package org.model;

/**
 * Created by miaol on 2016/5/27 0027.
 */
public class articlePublishModel
{
    private String articleTitle;
    private String articleDownloadUrl;
    private String articleImgPath;
    private String articleContent;
    private String articleContext;

    public String getArticleTitle() {
        return articleTitle;
    }

    public String getArticleDownloadUrl() {
        return articleDownloadUrl;
    }

    public String getArticleImgPath() {
        return articleImgPath;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public String getArticleContext() {
        return articleContext;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public void setArticleDownloadUrl(String articleDownloadUrl) {
        this.articleDownloadUrl = articleDownloadUrl;
    }

    public void setArticleImgPath(String articleImgPath) {
        this.articleImgPath = articleImgPath;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public void setArticleContext(String articleContext) {
        this.articleContext = articleContext;
    }
}
