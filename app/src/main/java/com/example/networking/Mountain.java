package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {

    public static int length;
    private String ID;
    private String name;

    private int height;
    @SerializedName("size")



    @Override
    public String toString() {
        return "Mountain{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }




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
