package com.booleanuk.core;

public class Account {

    private boolean isEnabled;
    private String email;
    private String password;

    public Account(String email, String password){
        this.isEnabled = false ;
        this.email = email;
        this.password = password;
    }

    public void changeStatus(){
        this.isEnabled = !this.isEnabled;
    }

    public boolean getStatus(){
        return this.isEnabled;
    }
}
