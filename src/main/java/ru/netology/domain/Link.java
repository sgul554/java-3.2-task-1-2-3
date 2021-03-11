package ru.netology.domain;

public class Link {
    private String image;
    private String nameOfLink;
    private String website;
    private boolean saveInBookmark;
    private int id;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNameOfLink() {
        return nameOfLink;
    }

    public void setNameOfLink(String nameOfLink) {
        this.nameOfLink = nameOfLink;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public boolean isSaveInBookmark() {
        return saveInBookmark;
    }

    public void setSaveInBookmark(boolean saveInBookmark) {
        this.saveInBookmark = saveInBookmark;
    }
}
