package org.model;

/**
 * Created by miaol on 2016/5/27 0027.
 */
public class indexViewModel
{
    private String articleTitle;
    private String articleAuthor;
    private String articlePublishDate;
    private String articleLabel;
    private String articleImgPath;
    private int articleCommentCount;
    private boolean isCollected;
    private int articleId;

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public boolean isCollected() {
        return isCollected;
    }

    public void setCollected(boolean collected) {
        isCollected = collected;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public String getArticlePublishDate() {
        return articlePublishDate;
    }

    public String getArticleLabel() {
        return articleLabel;
    }

    public String getArticleImgPath() {
        return articleImgPath;
    }

    public int getArticleCommentCount() {
        return articleCommentCount;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public void setArticlePublishDate(String articlePublishDate) {
        this.articlePublishDate = articlePublishDate;
    }

    public void setArticleLabel(String articleLabel) {
        this.articleLabel = articleLabel;
    }

    public void setArticleImgPath(String articleImgPath) {
        this.articleImgPath = articleImgPath;
    }

    public void setArticleCommentCount(int articleCommentCount) {
        this.articleCommentCount = articleCommentCount;
    }
}
