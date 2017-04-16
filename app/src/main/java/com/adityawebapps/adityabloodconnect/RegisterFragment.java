package com.adityawebapps.adityabloodconnect;


import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.fragment;
import static com.adityawebapps.adityabloodconnect.R.color.colorAccent;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {

    Button b1;
    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        final View view = inflater.inflate(R.layout.fragment_register, container, false);
        /*b1=(Button)view.findViewById(R.id.a_plus);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setBackground(getResources().getDrawable(R.drawable.bg_red));
            }
        });*/


        return inflater.inflate(R.layout.fragment_register, container, false);
    }





}

