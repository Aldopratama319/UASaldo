package com.aldo.uaspml.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUser {
    @SerializedName("data")
    List<com.aldo.uaspml.Model.User> data;
    @SerializedName("total")
    String total;

    public String getTotal() {
        return total;
    }

    public List<com.aldo.uaspml.Model.User> getData() {
        return data;
    }

    public void setData(List<com.aldo.uaspml.Model.User> data) {
        this.data = data;
    }

    public void setTotal(String total) {
        this.total = total;

    }
}
