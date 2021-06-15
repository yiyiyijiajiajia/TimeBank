package com.example.timebank.ui.add;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.timebank.MainActivity;
import com.example.timebank.R;

public class AddFragment extends Fragment {

    private AddViewModel addViewModel;
    private TextView CA_save;
    private TextView CA_cancel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        addViewModel =
                new ViewModelProvider(this).get(AddViewModel.class);
        View view = inflater.inflate(R.layout.fragment_add, container, false);

        CA_cancel=(TextView) view.findViewById(R.id.CA_cancle);
        CA_cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        CA_save=(TextView) view.findViewById(R.id.CA_save);
        CA_save.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainActivity.class);
                startActivity(intent);
            }
        });


        final TextView textView = view.findViewById(R.id.text_home);
//        addViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return view;
    }
}