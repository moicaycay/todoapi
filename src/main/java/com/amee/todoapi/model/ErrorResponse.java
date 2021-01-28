package com.amee.todoapi.model;

import java.io.Serializable;

public class ErrorResponse implements Serializable {
    private static final long serialVersionUID = 596927672292204763L;

    private Integer httpStatus;
    private Integer errorCode;
    private String errorMessage;
    private String developerMessage;

    public ErrorResponse(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorResponse(Integer httpStatus, String errorMessage, String developerMessage) {
        this.httpStatus = httpStatus;
        this.errorMessage = errorMessage;
        this.developerMessage = developerMessage;
    }

    public ErrorResponse(Integer httpStatus, String errorMessage) {
        this.httpStatus = httpStatus;
        this.errorMessage = errorMessage;
    }

    public ErrorResponse(Integer httpStatus, Integer errorCode, String errorMessage, String developerMessage) {
        this.httpStatus = httpStatus;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.developerMessage = developerMessage;
    }

    public Integer getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(Integer httpStatus) {
        this.httpStatus = httpStatus;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }
}
