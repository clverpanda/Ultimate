package org.vo;

/**
 * Created by miaol on 2016/5/16 0016.
 */
public class AssessEntity {
    private int id;
    private int assess;
    private UserEntity user;
    private ArticleEntity article;

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public ArticleEntity getArticle() {
        return article;
    }

    public void setArticle(ArticleEntity article) {
        this.article = article;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getAssess() {
        return assess;
    }

    public void setAssess(int assess) {
        this.assess = assess;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssessEntity that = (AssessEntity) o;

        if (id != that.id) return false;
        if (assess != that.assess) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + assess;
        return result;
    }
}
