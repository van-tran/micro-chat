package com.example.chat.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result<T> {

    private boolean success;
    private T data;
    private String errorCode;
    private String errorMessage;

    public Result(T data) {
        this(true, data, "", "");
    }

    public Result(boolean success) {
        this(success, null, "", "");
    }

}
