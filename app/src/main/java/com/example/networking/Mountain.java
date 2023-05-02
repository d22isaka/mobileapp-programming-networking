package com.example.networking;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Mountain {

    public static int length;
    private String ID;
    private String name;
    @SerializedName("size")



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

}
