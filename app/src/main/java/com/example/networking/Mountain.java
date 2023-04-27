package com.example.networking;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Mountain {

    @SerializedName("Size")

    private int meter;

    private String name;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "meter=" + meter +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", gson=" + gson +
                '}';
    }


    Gson gson = new Gson();


}
