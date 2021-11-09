package com.magdamiu.androidfundamentalsfall2021;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CakeViewHolder extends RecyclerView.ViewHolder {

    private final ImageView cakeImage;
    private final TextView cakeName;

    public CakeViewHolder(@NonNull View itemView) {
        super(itemView);
        cakeImage = itemView.findViewById(R.id.cakeImage);
        cakeName = itemView.findViewById(R.id.cakeName);
    }

    public ImageView getCakeImage() {
        return cakeImage;
    }

    public TextView getCakeName() {
        return cakeName;
    }
}
