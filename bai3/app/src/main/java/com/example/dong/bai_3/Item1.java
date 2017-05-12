package com.example.dong.bai_3;

import java.io.Serializable;

/**
 * Created by DONG on 5/12/2017.
 */

public class Item1 implements Serializable{
    private int photo;
    private String name;

    public Item1() {
    }

    public Item1(int photo, String name) {
        this.photo = photo;
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
