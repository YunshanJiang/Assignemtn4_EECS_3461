package com.example.a4chatapp;

public class Discovery {

    private String destitle;
    private String description;
    private String url;
    private int photo;


    public Discovery(String destile, String description, int photo, String url) {
        this.destitle = destile;
        this.description = description;
        this.photo = photo;
        this.url = url;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
    public String getDestitle() {
        return destitle;
    }

    public void setDestitle(String destitle) {
        this.destitle = destitle;
    }

}
