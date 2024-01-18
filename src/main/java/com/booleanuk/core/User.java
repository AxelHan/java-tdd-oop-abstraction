package com.booleanuk.core;

public class User {

    private String name;
    private Account account;

    public User(String name){
        this.name = name;
        this.account = null;

    }

    public String createAccount(String email, String password){
        if(!email.contains("@")){
            return "invalid email";
        }
        if (password.length() < 8){
            return "invalid password";
        }
        this.account = new Account(email, password);
        return "Account created";
    }

    public String login(String email, String password){
        if(this.account == null){
            return "You have not created an account";
        }
        if (!this.account.getStatus()){
            return "Account disabled";
        }
        else {
            return "Account enabled";
        }
    }

    public Account getAccount() {
        return account;
    }
}
