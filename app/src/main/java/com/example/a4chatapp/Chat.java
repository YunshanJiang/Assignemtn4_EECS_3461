package com.example.a4chatapp;

public class Chat {

    private String sender;
    private String receiver;
    private String message;



    private int imgid;
    public Chat(String sender, String receiver, String message, int imgid) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.imgid = imgid;
    }
    public  Chat(){

    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
