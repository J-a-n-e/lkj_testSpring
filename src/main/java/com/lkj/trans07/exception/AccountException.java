package com.lkj.trans07.exception;

public class AccountException extends  RuntimeException {

    public AccountException() {
    }

    public AccountException(String message) {
        super(message);
    }
}