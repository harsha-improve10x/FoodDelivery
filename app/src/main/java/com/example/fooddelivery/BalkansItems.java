package com.example.fooddelivery;

import android.widget.ImageView;

public class BalkansItems {

    public String name;
    public String items;
    public String serving;
    public float foodCurrency;
    public float weight;
    public String foodImage;

    public BalkansItems() {
    }

    public BalkansItems(String name, String items, String serving, float foodCurrency, float weight, String foodImage) {
        this.name = name;
        this.items = items;
        this.serving = serving;
        this.foodCurrency = foodCurrency;
        this.weight = weight;
        this.foodImage = foodImage;
    }
}
