package com.amee.todoapi.utils;


public class Constants {

    public static final int ERROR_CODE = -9999;
    public static final int SUCCESS_CODE= 100;
    public static final String ACCESS_DENIED = "Access Denied";
    public static final String INTERNAL_SERVER_ERROR = "Internal Server Error";
    public static final String FILED_NOT_NULL = "All filed not null";

    public static final String URL_BASE = "/1.0/todo";
    public static final String URL_GET_TODO = "/get-todo";
    public static final String URL_INSERT_TODO = "/insert-todo";
    public static final String URL_UPDATE_TODE = "/update-todo";
    public static final String URL_DELETE_TODO = "/delete-todo/{id}";

    public static final String PAGE_DEFAULT = "0";
    public static final String SIZE_PAGE_DEFAULT = "5";
    public static final String SORT_ASC = "asc";
    public static final String SORT_DESC = "desc";
}
