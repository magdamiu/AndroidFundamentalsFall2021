package com.magdamiu.androidfundamentalsfall2021;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CakeAdapter extends RecyclerView.Adapter<CakeViewHolder> {

    private List<Cake> cakes;

    public CakeAdapter(List<Cake> cakes) {
        this.cakes = cakes;
    }

    @NonNull
    @Override
    public CakeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cake_item, parent, false);
        return new CakeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CakeViewHolder holder, int position) {
        Cake currentCake = cakes.get(position);
        holder.getCakeName().setText(currentCake.getName());
    }

    // how many items will be displayed inside of the RecyclerView
    @Override
    public int getItemCount() {
        return cakes.size();
    }
}
