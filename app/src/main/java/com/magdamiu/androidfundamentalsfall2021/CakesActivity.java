package com.magdamiu.androidfundamentalsfall2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CakesActivity extends AppCompatActivity {

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
        cakes.add(new Cake("ecler", "poza"));
        cakes.add(new Cake("cozonac", "poza"));
        cakes.add(new Cake("clatite", "poza"));
        cakes.add(new Cake("placinta", "poza"));
        cakes.add(new Cake("cornulete", "poza"));
        cakes.add(new Cake("inghetata", "poza"));
        cakes.add(new Cake("tiramisu", "poza"));
        cakes.add(new Cake("briosa", "poza"));
        cakes.add(new Cake("gogosi", "poza"));
        cakes.add(new Cake("gogosele", "poza"));
        cakes.add(new Cake("rulada", "poza"));
    }

    // setup LayoutManager
    private void setupLayoutManager() {
        cakesRecyclerView.setLayoutManager(new LinearLayoutManager(CakesActivity.this));
    }

}