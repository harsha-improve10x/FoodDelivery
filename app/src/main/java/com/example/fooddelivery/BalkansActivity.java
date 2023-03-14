package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fooddelivery.databinding.ActivityBalkansBinding;

import java.util.ArrayList;

public class BalkansActivity extends AppCompatActivity {

    private ActivityBalkansBinding balkansBinding;
    private ArrayList<BalkansItems> balkansItemsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        balkansBinding = ActivityBalkansBinding.inflate(getLayoutInflater());
        setContentView(balkansBinding.getRoot());
        getSupportActionBar().setTitle("Balkans Activity");
        setData();
    }

    private void setData() {
        balkansItemsArrayList = new ArrayList<>();
        BalkansItems chickenSoup = new BalkansItems("Chicken Soup","chicken, Vegetables, butter, tiny pasta, carrots",
                "Serving : 2", 8.00f,345.0f, "https://cdn.apartmenttherapy.info/image/upload/f_jpg,q_auto:eco,c_fill,g_auto,w_1500,ar_1:1/k%2FEdit%2F2023-01-Creamy-Chicken-Soup%2Fcreamy-chicken-soup-4");
        balkansItemsArrayList.add(chickenSoup);
    }
}