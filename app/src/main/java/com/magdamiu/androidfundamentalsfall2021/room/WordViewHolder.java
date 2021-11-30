package com.magdamiu.androidfundamentalsfall2021.room;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.magdamiu.androidfundamentalsfall2021.R;

public class WordViewHolder extends RecyclerView.ViewHolder {
       protected final TextView wordItemView;

       public WordViewHolder(View itemView) {
           super(itemView);
           wordItemView = itemView.findViewById(R.id.textView);
       }
   }