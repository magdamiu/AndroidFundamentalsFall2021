package com.magdamiu.androidfundamentalsfall2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CakesActivity extends AppCompatActivity {
    private final String CAKE_URL = "https://www.freepnglogos.com/uploads/cake-png/birthday-cake-png-transparent-birthday-cake-images-12.png";
    private List<Cake> cakes;
    private RecyclerView cakesRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cakes);

        cakesRecyclerView = this.findViewById(R.id.cakesRecyclerView);
        setupCakes();
        setupLayoutManager();
        setupAdapter();
    }

    private void setupAdapter() {
        cakesRecyclerView.setAdapter(new CakeAdapter(cakes));
    }

    // data source
    private void setupCakes() {
        cakes = new ArrayList<>();
        cakes.add(new Cake("ecler", CAKE_URL));
        cakes.add(new Cake("cozonac", CAKE_URL));
        cakes.add(new Cake("clatite", CAKE_URL));
        cakes.add(new Cake("placinta", CAKE_URL));
        cakes.add(new Cake("cornulete", CAKE_URL));
        cakes.add(new Cake("inghetata", CAKE_URL));
        cakes.add(new Cake("tiramisu", CAKE_URL));
        cakes.add(new Cake("briosa", CAKE_URL));
        cakes.add(new Cake("gogosi", CAKE_URL));
        cakes.add(new Cake("gogosele", CAKE_URL));
        cakes.add(new Cake("rulada", CAKE_URL));
    }

    // setup LayoutManager
    private void setupLayoutManager() {
        cakesRecyclerView.setLayoutManager(new LinearLayoutManager(CakesActivity.this));
    }

}