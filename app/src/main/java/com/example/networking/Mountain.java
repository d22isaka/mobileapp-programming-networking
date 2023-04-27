package com.example.networking;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Mountain {

    private String id;
    private String name;

    @SerializedName("Size")
    private int meter;

    Gson gson = new Gson();

}
