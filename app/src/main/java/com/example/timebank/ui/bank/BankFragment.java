package com.example.timebank.ui.bank;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.timebank.R;

public class BankFragment extends Fragment {

    private BankViewModel bankViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bankViewModel =
                new ViewModelProvider(this).get(BankViewModel.class);
        View view = inflater.inflate(R.layout.fragment_bank, container, false);
        final TextView textView = view.findViewById(R.id.TITLE);
//        bankViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return view;
    }
}