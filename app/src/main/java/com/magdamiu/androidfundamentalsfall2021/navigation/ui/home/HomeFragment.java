package com.magdamiu.androidfundamentalsfall2021.navigation.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.magdamiu.androidfundamentalsfall2021.R;
import com.magdamiu.androidfundamentalsfall2021.room.Word;
import com.magdamiu.androidfundamentalsfall2021.room.WordViewModel;

import java.util.List;

public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        // Get a new or existing ViewModel from the ViewModelProvider.
        WordViewModel wordViewModel = new ViewModelProvider(getActivity()).get(WordViewModel.class);

        // Add an observer on the LiveData returned by getAlphabetizedWords.
        // The onChanged() method fires when the observed data changes and the activity is
        // in the foreground.
        wordViewModel.getAllWords().observe(getActivity(), new Observer<List<Word>>() {
            @Override
            public void onChanged(final List<Word> words) {
                // Update the cached copy of the words in the adapter.
                Log.e("Da","Da");
                //adapter.setWords(words);
            }
        });
        return v;
    }
}