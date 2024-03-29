package com.magdamiu.androidfundamentalsfall2021.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.magdamiu.androidfundamentalsfall2021.LearnActivity;
import com.magdamiu.androidfundamentalsfall2021.R;

import java.util.ArrayList;
import java.util.List;

public class CakesActivity extends AppCompatActivity {
    private final String CAKE_URL = "https://www.freepnglogos.com/uploads/cake-png/birthday-cake-png-transparent-birthday-cake-images-12.png";
    public static final String RESULT = "response";
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

        processReceivedInfo();

        sendResult();
    }

    private void sendResult() {
        String result = "Yes, I am here";
        Intent intent = new Intent();
        intent.putExtra(RESULT, result);
        setResult(RESULT_OK, intent);
        finish();
    }

    private void processReceivedInfo() {
        Bundle giftMessage = getIntent().getExtras();
        if(giftMessage != null) {
            String receivedMessage = giftMessage.getString(LearnActivity.MESSAGE);
            int receivedCount = giftMessage.getInt(LearnActivity.COUNT);
            Toast.makeText(CakesActivity.this, String.format("%s %d", receivedMessage, receivedCount), Toast.LENGTH_LONG).show();
        }
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