package com.aldo.uaspml.Model;

import com.google.gson.annotations.SerializedName;

public class PostPutDelUser {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    com.aldo.uaspml.Model.User mUser;
    @SerializedName("message")
    String message;
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public com.aldo.uaspml.Model.User getmUser() {
        return mUser;
    }
    public void setKontak(com.aldo.uaspml.Model.User mUser) {
        mUser = mUser;
    }
}
