package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void testChangeStatus(){
        Account account = new Account();
        Assertions.assertFalse(account.getStatus());
        account.changeStatus();
        Assertions.assertTrue(account.getStatus());

    }
}
