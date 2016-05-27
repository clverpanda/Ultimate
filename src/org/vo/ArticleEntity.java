package org.vo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by miaol on 2016/5/16 0016.
 */
public class ArticleEntity {
    private int articleId;
    private String title;
    private String content;
    private String context;
    private String download;
    //private int authorId;
    private Timestamp publishtime;
    private boolean checked;
    private UserEntity author;
    private String imageUrl;
    private Set<LableEntity> lables = new HashSet<>();
    private Set<CommentEntity> comments = new HashSet<>();
    private Set<AssessEntity> assesses = new HashSet<>();

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Set<CommentEntity> getComments() {
        return comments;
    }

    public void setComments(Set<CommentEntity> comments) {
        this.comments = comments;
    }

    public Set<AssessEntity> getAssesses() {
        return assesses;
    }

    public void setAssesses(Set<AssessEntity> assesses) {
        this.assesses = assesses;
    }

    public Set<LableEntity> getLables() {
        return lables;
    }

    public void setLables(Set<LableEntity> lables) {
        this.lables = lables;
    }

    public UserEntity getAuthor() {
        return author;
    }

    public void setAuthor(UserEntity author) {
        this.author = author;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContext() {
        return context;
    }


    public void setContext(String context) {
        this.context = context;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download;
    }

//    public int getAuthorId() {
//        return authorId;
//    }
//
//    public void setAuthorId(int authorId) {
//        this.authorId = authorId;
//    }

    public Timestamp getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Timestamp publishtime) {
        this.publishtime = publishtime;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleEntity that = (ArticleEntity) o;

        if (articleId != that.articleId) return false;
        //if (authorId != that.authorId) return false;
        if (checked != that.checked) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (context != null ? !context.equals(that.context) : that.context != null) return false;
        if (download != null ? !download.equals(that.download) : that.download != null) return false;
        if (publishtime != null ? !publishtime.equals(that.publishtime) : that.publishtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = articleId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (context != null ? context.hashCode() : 0);
        result = 31 * result + (download != null ? download.hashCode() : 0);
        //result = 31 * result + authorId;
        result = 31 * result + (publishtime != null ? publishtime.hashCode() : 0);
        result = 31 * result + (checked ? 1 : 0);
        return result;
    }
}
