package com.example.retrofit_postrequest_1;

import com.google.gson.annotations.SerializedName;

public class Post {

    private String username;

    private String password;

    private Boolean loginSuccess;



    @SerializedName("body")
    private String text;

    public Post(String username, String password, Boolean loginSuccess) {
        this.username = username;
        this.password = password;
        this.loginSuccess=loginSuccess;

    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getLoginSuccess(){
        return getLoginSuccess();
    }

}