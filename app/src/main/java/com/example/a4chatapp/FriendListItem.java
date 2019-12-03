package com.example.a4chatapp;

public class FriendListItem {

    private String name;
    private int photo;



    private int roomID;
    public FriendListItem(){

    }
    public FriendListItem(String name, int photo, int roomID){
        this.name = name;
        this.photo = photo;
        this.roomID = roomID;
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


    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }
}
