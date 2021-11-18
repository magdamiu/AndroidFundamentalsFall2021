package com.magdamiu.androidfundamentalsfall2021.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.magdamiu.androidfundamentalsfall2021.R;


public class SumFragment extends Fragment {

    private EditText firstNumber, secondNumber;
    private Button sendNumbers;

    public SumFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sum, container, false);

        firstNumber = view.findViewById(R.id.firstNumber);
        secondNumber = view.findViewById(R.id.secondNumber);
        sendNumbers = view.findViewById(R.id.sendNumbers);

        sendNumbers.setOnClickListener(view1 -> sendNumbersToActivity());

        return view;
    }

    private void sendNumbersToActivity() {
        // TODO to validate the content from the EditTexts
        int first = Integer.parseInt(firstNumber.getText().toString());
        int second = Integer.parseInt(secondNumber.getText().toString());
        HostListener listener = (HostListener) getActivity();
        listener.addTwoNumbers(first, second);
    }
}