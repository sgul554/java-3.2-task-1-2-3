package ru.netology.domain;

public class CommentsInfo {
    private String photoUrl;
    private String textForComment;
    private UploadButton uploadButton;
    private String uploadPhoto;
    private String emoji;
    private String sendButton;

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getTextForComment() {
        return textForComment;
    }

    public void setTextForComment(String textForComment) {
        this.textForComment = textForComment;
    }

    public UploadButton getUploadButton() {
        return uploadButton;
    }

    public void setUploadButton(UploadButton uploadButton) {
        this.uploadButton = uploadButton;
    }

    public String getUploadPhoto() {
        return uploadPhoto;
    }

    public void setUploadPhoto(String uploadPhoto) {
        this.uploadPhoto = uploadPhoto;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public String getSendButton() {
        return sendButton;
    }

    public void setSendButton(String sendButton) {
        this.sendButton = sendButton;
    }
}
