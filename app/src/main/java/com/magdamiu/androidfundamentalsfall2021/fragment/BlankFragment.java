package com.magdamiu.androidfundamentalsfall2021.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.magdamiu.androidfundamentalsfall2021.R;


public class BlankFragment extends Fragment {
    private TextView resultTextView;
    private String name;
    private int value;
    private String message;

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = getArguments().getString(SecondHostActivity.NAME);
            value = getArguments().getInt(SecondHostActivity.VALUE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        resultTextView = view.findViewById(R.id.textViewResult);
        resultTextView.setText(String.format("%s %d", name, value));
        return view;
    }

    public void setMessage(String message) {
        this.message = message;
        Log.e("BlankFragment", message);
    }
}