package org.vo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by miaol on 2016/5/16 0016.
 */
public class UserEntity {
    private int userid;
    private String username;
    private String password;
    private String image;
    private Timestamp lastupdatetime;
    private UserRoleEntity role;
    private Set<ArticleEntity> collects = new HashSet<>();
    private Set<UserEntity> follows = new HashSet<>();
    private Set<CommentEntity> comments = new HashSet<>();
    private Set<AssessEntity> assesses = new HashSet<>();

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

    public Set<UserEntity> getFollows() {

        return follows;
    }

    public void setFollows(Set<UserEntity> follows) {
        this.follows = follows;
    }

    public Set<ArticleEntity> getCollects() {
        return collects;
    }

    public void setCollects(Set<ArticleEntity> collects) {
        this.collects = collects;
    }

    public UserRoleEntity getRole() {
        return role;
    }

    public void setRole(UserRoleEntity role) {
        this.role = role;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Timestamp getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Timestamp lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (userid != that.userid) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (lastupdatetime != null ? !lastupdatetime.equals(that.lastupdatetime) : that.lastupdatetime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (lastupdatetime != null ? lastupdatetime.hashCode() : 0);
        return result;
    }
}
