package ru.netology.domain;

public class Post {
    private String logoUrl;
    private String nameOfPageUrl;
    private String dateAndTimeUrl;
    private boolean sign;
    private String text;
    private Link link;
    private boolean like;
    private boolean share;
    private Another another;
    private String views;
    private CommentsInfo commentsInfo;
    private String closeButton;
    private String nextPageButton;
    private String prevPageButton;

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getNameOfPageUrl() {
        return nameOfPageUrl;
    }

    public void setNameOfPageUrl(String nameOfPageUrl) {
        this.nameOfPageUrl = nameOfPageUrl;
    }

    public String getDateAndTimeUrl() {
        return dateAndTimeUrl;
    }

    public void setDateAndTimeUrl(String dateAndTimeUrl) {
        this.dateAndTimeUrl = dateAndTimeUrl;
    }

    public boolean isSign() {
        return sign;
    }

    public void setSign(boolean sign) {
        this.sign = sign;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public boolean isShare() {
        return share;
    }

    public void setShare(boolean share) {
        this.share = share;
    }

    public Another getAnother() {
        return another;
    }

    public void setAnother(Another another) {
        this.another = another;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public String getCloseButton() {
        return closeButton;
    }

    public void setCloseButton(String closeButton) {
        this.closeButton = closeButton;
    }

    public String getNextPageButton() {
        return nextPageButton;
    }

    public void setNextPageButton(String nextPageButton) {
        this.nextPageButton = nextPageButton;
    }

    public String getPrevPageButton() {
        return prevPageButton;
    }

    public void setPrevPageButton(String prevPageButton) {
        this.prevPageButton = prevPageButton;
    }
}
