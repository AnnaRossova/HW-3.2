package ru.netology.domain;

public class CommentsInfo {
    private int id;
    private String author;
    private String text;
    private boolean addPhoto;
    private boolean addAudio;
    private boolean addVideo;
    private boolean addDoc;
    private boolean addSmile;
    private boolean publish;
    private boolean delete;
    private boolean edit;
    private String date;
    private boolean copmlainForComment;
    private boolean likeForComment;
    private boolean replyForComment;
    private int viewsReplyForComments;


    public int getId

    {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }


    public String getAuthor

    {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getText

    {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public boolean getAddPhoto

    {
        return addPhoto;
    }

    public void setAddPhoto(boolean addPhoto) {
        this.addPhoto = addPhoto;
    }


    public boolean getAddAudio

    {
        return addAudio;
    }

    public void setAddAudio(boolean addAudio) {
        this.addAudio = addAudio;
    }


    public boolean getAddVideo

    {
        return addVideo;
    }

    public void setAddVideo(boolean addVideo) {
        this.addVideo = addVideo;
    }


    public boolean getDoc

    {
        return addDoc;
    }

    public void setAddDoc(boolean addDoc) {
        this.addDoc = addDoc;
    }


    public boolean getSmile

    {
        return addSmile;
    }

    public void setSmile(boolean addSmile) {
        this.addSmile = addSmile;
    }


    public boolean getPublish

    {
        return publish;
    }

    public void setSmile(boolean publish) {
        this.publish = publish;
    }


    public boolean getDelete

    {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }


    public boolean getEdit

    {
        return edit
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }


    public String getDate

    {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public boolean getCopmlainForComment

    {
        return copmlainForComment;
    }

    public void setCopmlainForComment(boolean copmlainForComment) {
        this.copmlainForComment = copmlainForComment;
    }


    public boolean getLikeForComment

    {
        return likeForComment;
    }

    public void setLikeForComment(boolean likeForComment) {
        this.likeForComment = likeForComment;
    }


    public boolean getReplyForComment

    {
        return replyForComment;
    }

    public void setReplyForComment(boolean replyForComment) {
        this.replyForComment = replyForComment;
    }


    public int getViewsReplyForComments

    {
        return viewsReplyForComments;
    }

    public void setViewsReplyForComment(int viewsReplyForComments) {
        this.viewsReplyForComments = viewsReplyForComments;
    }

}




