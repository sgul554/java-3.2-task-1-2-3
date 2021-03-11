package ru.netology.domain;

public class Link {
    private String image;
    private String nameOfLink;
    private String website;
    private boolean saveInBookmark;

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
