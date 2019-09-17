package com.aschimmichanga.tulip.firestore;

import java.util.HashMap;
import com.google.firebase.firestore.PropertyName;


public class User {

    private String userName;
    private String profileImageUrl;
    private HashMap<String, Object> bookList;

    public User() {
        userName = "";
        profileImageUrl = null;
        bookList = new HashMap<>();
    }

    public User(String ID, String Url, HashMap<String,Object> list) {
        userName = ID;
        profileImageUrl = Url;
        bookList = list;
    }

    //getters
    @PropertyName("userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String user) {
        userName = user;
    }

    @PropertyName("profileImageUrl")
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public void setInventory(HashMap<String, Object> items) {
        this.bookList = items;
    }

    public void addToInventory(String name, Object item) {
        this.bookList.put(name, item);
    }

    @PropertyName("inventory")
    public HashMap<String,Object> getInventory ()
    {
        return bookList;
    }

    public void removeFromInventory(String name) {
        this.bookList.remove(name);
    }

    public Object getFromInventory (String name)
    {
        return bookList.get(name);
    }

}

