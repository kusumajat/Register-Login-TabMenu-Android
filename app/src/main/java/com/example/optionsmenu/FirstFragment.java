package com.example.optionsmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    // Declare EditText and Button variables
    private EditText usernameEditText;
    private Button registerButton;

    // Fragment initialization parameters
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public FirstFragment() {
        // Required empty public constructor
    }

    public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        // Initialize the EditText and Button from the layout
        usernameEditText = view.findViewById(R.id.username);
        registerButton = view.findViewById(R.id.register_button);

        // Set a click listener for the Register button
        registerButton.setOnClickListener(v -> {
            // Retrieve the username from the EditText
            String username = usernameEditText.getText().toString();

            // Create an Intent to start SecondActivity
            Intent intent = new Intent(getActivity(), SecondActivity.class);

            // Pass the username to SecondActivity using the Intent
            intent.putExtra("USERNAME", username);

            // Start SecondActivity
            startActivity(intent);
        });

        return view;
    }
}
