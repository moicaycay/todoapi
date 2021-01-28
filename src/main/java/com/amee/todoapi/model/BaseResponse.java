package com.amee.todoapi.model;

import org.springframework.http.HttpStatus;

public class BaseResponse {
    private HttpStatus status;
    private Integer code;
    private String message;

    public BaseResponse() {
    }

    public BaseResponse(String message) {
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
