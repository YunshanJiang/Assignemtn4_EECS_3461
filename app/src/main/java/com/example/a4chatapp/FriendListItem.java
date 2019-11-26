package com.example.a4chatapp;

public class FriendListItem {

    private String name;
    private int photo;
    public FriendListItem(){

    }
    public FriendListItem(String name, int photo){
        this.name = name;
        this.photo = photo;
    }

    public String getName(){
        return name;
    }

    public int getPhoto(){
        return photo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
