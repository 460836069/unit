package com.xcy.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;

public class LoginResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int token;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;

    public LoginResult(int status, int token, String message){
        this.status = status;
        this.token = token;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
