package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testCreateAccount(){
        User user = new User("Axel");

        user.createAccount("axel.co.hannson@gmail.com", "myPassword");
        Assertions.assertNotNull(user.account);
    }

    @Test
    public void testInvalidPassword(){
        User user = new User("Axel");

        Assertions.assertEquals("invalid password", user.createAccount("axel.co.hannson@gmail.com", "short"));

    }

    @Test
    public void testInvalidEmail(){
        User user = new User("Axel");

        Assertions.assertEquals("invalid email", user.createAccount("axel.co.hannsonAgmail.com", "myPassword"));

    }

    @Test
    public void testLoginNoAccount(){
        User user = new User("Axel");
        Assertions.assertEquals("You have not created an account", user.login("email", "password"));
    }

    @Test
    public void testLoginWithAccount(){
        User user = new User("Axel");
        user.createAccount("axel.co.hannson@gmail.com", "myPassword");
        Assertions.assertEquals("Account disabled", user.login("email", "myPassword"));
        user.account.changeStatus();
        Assertions.assertEquals("Account enabled", user.login("email", "myPassword"));
    }

}
