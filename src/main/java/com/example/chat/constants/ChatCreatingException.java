package com.example.chat.constants;

public class ChatCreatingException extends Exception{
    ErrorCode errorCode;
    public ChatCreatingException(ErrorCode err){
        super();
        errorCode = err;
    }
}
