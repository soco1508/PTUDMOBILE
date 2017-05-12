package com.example.dong.bai52;

import java.io.Serializable;

/**
 * Created by DONG on 3/9/2017.
 */

public class Item implements Serializable {
    private int ID;
    private String name;


    public Item() {
    }

    public Item(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
