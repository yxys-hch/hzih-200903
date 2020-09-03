package com.po;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "t_blog")
public class Blog {

    @Id
    @GeneratedValue
    private  Long id;

    private  String title;
    private  String content;
    private  String firstPictrue;
    private  String flag;
    private  Integer views;
    private  boolean appreciation;
    private  boolean shareStatement;
    private  boolean comentabled;
    private  boolean published;
    private  boolean recommend;
    @Temporal(TemporalType.TIMESTAMP)
    private  Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private  Date updateTime;

    @ManyToOne
    private Type type;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getFirstPictrue() {
        return firstPictrue;
    }

    public void setFirstPictrue(String firstPictrue) {
        this.firstPictrue = firstPictrue;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public boolean isAppreciation() {
        return appreciation;
    }

    public void setAppreciation(boolean appreciation) {
        this.appreciation = appreciation;
    }

    public boolean isShareStatement() {
        return shareStatement;
    }

    public void setShareStatement(boolean shareStatement) {
        this.shareStatement = shareStatement;
    }

    public boolean isComentabled() {
        return comentabled;
    }

    public void setComentabled(boolean comentabled) {
        this.comentabled = comentabled;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public boolean isRecommend() {
        return recommend;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Blog() {
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", firstPictrue='" + firstPictrue + '\'' +
                ", flag='" + flag + '\'' +
                ", views=" + views +
                ", appreciation=" + appreciation +
                ", shareStatement=" + shareStatement +
                ", comentabled=" + comentabled +
                ", published=" + published +
                ", recommend=" + recommend +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
