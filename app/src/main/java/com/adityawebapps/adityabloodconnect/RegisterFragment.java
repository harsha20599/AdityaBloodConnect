package com.adityawebapps.adityabloodconnect;


import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.fingerprintAuthDrawable;
import static android.R.attr.fragment;
import static android.R.color.white;
import static com.adityawebapps.adityabloodconnect.R.color.colorAccent;
import static com.adityawebapps.adityabloodconnect.R.color.foreground_material_dark;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {

    Button aplus,aminus,bplus,bminus,abplus,abminus,oplus,ominus;
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
        aplus = (Button) view.findViewById(R.id.a_plus);
        aminus = (Button) view.findViewById(R.id.a_minus);
        bplus = (Button) view.findViewById(R.id.b_plus);
        bminus = (Button) view.findViewById(R.id.b_minus);
        abplus = (Button) view.findViewById(R.id.ab_plus);
        abminus = (Button) view.findViewById(R.id.ab_minus);
        oplus = (Button) view.findViewById(R.id.o_plus);
        ominus = (Button) view.findViewById(R.id.o_minus);
        AutoCompleteTextView districtText = (AutoCompleteTextView) view.findViewById(R.id.district);
        String[]  district_names;
        district_names = getResources().getStringArray(R.array.districts);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,district_names);
        districtText.setAdapter(adapter);

        aplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aplus.setBackgroundResource(R.drawable.bg_red);
                aplus.setTextColor(Color.parseColor("#ffffff"));

                aminus.setBackgroundResource(R.drawable.bg_white);
                aminus.setTextColor(Color.parseColor("#000000"));
                bplus.setBackgroundResource(R.drawable.bg_white);
                bplus.setTextColor(Color.parseColor("#000000"));
                bminus.setBackgroundResource(R.drawable.bg_white);
                bminus.setTextColor(Color.parseColor("#000000"));
                abplus.setBackgroundResource(R.drawable.bg_white);
                abplus.setTextColor(Color.parseColor("#000000"));
                abminus.setBackgroundResource(R.drawable.bg_white);
                abminus.setTextColor(Color.parseColor("#000000"));
                oplus.setBackgroundResource(R.drawable.bg_white);
                oplus.setTextColor(Color.parseColor("#000000"));
                ominus.setBackgroundResource(R.drawable.bg_white);
                ominus.setTextColor(Color.parseColor("#000000"));

            }
        });
        aminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aminus.setBackgroundResource(R.drawable.bg_red);
                aminus.setTextColor(Color.parseColor("#ffffff"));

                aplus.setBackgroundResource(R.drawable.bg_white);
                aplus.setTextColor(Color.parseColor("#000000"));
                bplus.setBackgroundResource(R.drawable.bg_white);
                bplus.setTextColor(Color.parseColor("#000000"));
                bminus.setBackgroundResource(R.drawable.bg_white);
                bminus.setTextColor(Color.parseColor("#000000"));
                abplus.setBackgroundResource(R.drawable.bg_white);
                abplus.setTextColor(Color.parseColor("#000000"));
                abminus.setBackgroundResource(R.drawable.bg_white);
                abminus.setTextColor(Color.parseColor("#000000"));
                oplus.setBackgroundResource(R.drawable.bg_white);
                oplus.setTextColor(Color.parseColor("#000000"));
                ominus.setBackgroundResource(R.drawable.bg_white);
                ominus.setTextColor(Color.parseColor("#000000"));
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bplus.setBackgroundResource(R.drawable.bg_red);
                bplus.setTextColor(Color.parseColor("#ffffff"));

                aminus.setBackgroundResource(R.drawable.bg_white);
                aminus.setTextColor(Color.parseColor("#000000"));
                aplus.setBackgroundResource(R.drawable.bg_white);
                aplus.setTextColor(Color.parseColor("#000000"));
                bminus.setBackgroundResource(R.drawable.bg_white);
                bminus.setTextColor(Color.parseColor("#000000"));
                abplus.setBackgroundResource(R.drawable.bg_white);
                abplus.setTextColor(Color.parseColor("#000000"));
                abminus.setBackgroundResource(R.drawable.bg_white);
                abminus.setTextColor(Color.parseColor("#000000"));
                oplus.setBackgroundResource(R.drawable.bg_white);
                oplus.setTextColor(Color.parseColor("#000000"));
                ominus.setBackgroundResource(R.drawable.bg_white);
                ominus.setTextColor(Color.parseColor("#000000"));
            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bminus.setBackgroundResource(R.drawable.bg_red);
                bminus.setTextColor(Color.parseColor("#ffffff"));

                aminus.setBackgroundResource(R.drawable.bg_white);
                aminus.setTextColor(Color.parseColor("#000000"));
                aplus.setBackgroundResource(R.drawable.bg_white);
                aplus.setTextColor(Color.parseColor("#000000"));
                bplus.setBackgroundResource(R.drawable.bg_white);
                bplus.setTextColor(Color.parseColor("#000000"));
                abplus.setBackgroundResource(R.drawable.bg_white);
                abplus.setTextColor(Color.parseColor("#000000"));
                abminus.setBackgroundResource(R.drawable.bg_white);
                abminus.setTextColor(Color.parseColor("#000000"));
                oplus.setBackgroundResource(R.drawable.bg_white);
                oplus.setTextColor(Color.parseColor("#000000"));
                ominus.setBackgroundResource(R.drawable.bg_white);
                ominus.setTextColor(Color.parseColor("#000000"));
            }
        });
        abplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abplus.setBackgroundResource(R.drawable.bg_red);
                abplus.setTextColor(Color.parseColor("#ffffff"));

                aminus.setBackgroundResource(R.drawable.bg_white);
                aminus.setTextColor(Color.parseColor("#000000"));
                aplus.setBackgroundResource(R.drawable.bg_white);
                aplus.setTextColor(Color.parseColor("#000000"));
                bplus.setBackgroundResource(R.drawable.bg_white);
                bplus.setTextColor(Color.parseColor("#000000"));
                bminus.setBackgroundResource(R.drawable.bg_white);
                bminus.setTextColor(Color.parseColor("#000000"));
                abminus.setBackgroundResource(R.drawable.bg_white);
                abminus.setTextColor(Color.parseColor("#000000"));
                oplus.setBackgroundResource(R.drawable.bg_white);
                oplus.setTextColor(Color.parseColor("#000000"));
                ominus.setBackgroundResource(R.drawable.bg_white);
                ominus.setTextColor(Color.parseColor("#000000"));
            }
        });
        abminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               abminus.setBackgroundResource(R.drawable.bg_red);
               abminus.setTextColor(Color.parseColor("#ffffff"));

                aminus.setBackgroundResource(R.drawable.bg_white);
                aminus.setTextColor(Color.parseColor("#000000"));
                aplus.setBackgroundResource(R.drawable.bg_white);
                aplus.setTextColor(Color.parseColor("#000000"));
                bplus.setBackgroundResource(R.drawable.bg_white);
                bplus.setTextColor(Color.parseColor("#000000"));
                bminus.setBackgroundResource(R.drawable.bg_white);
                bminus.setTextColor(Color.parseColor("#000000"));
                abplus.setBackgroundResource(R.drawable.bg_white);
                abplus.setTextColor(Color.parseColor("#000000"));;
                oplus.setBackgroundResource(R.drawable.bg_white);
                oplus.setTextColor(Color.parseColor("#000000"));
                ominus.setBackgroundResource(R.drawable.bg_white);
                ominus.setTextColor(Color.parseColor("#000000"));
            }
        });
        oplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oplus.setBackgroundResource(R.drawable.bg_red);
                oplus.setTextColor(Color.parseColor("#ffffff"));

                aminus.setBackgroundResource(R.drawable.bg_white);
                aminus.setTextColor(Color.parseColor("#000000"));
                aplus.setBackgroundResource(R.drawable.bg_white);
                aplus.setTextColor(Color.parseColor("#000000"));
                bplus.setBackgroundResource(R.drawable.bg_white);
                bplus.setTextColor(Color.parseColor("#000000"));
                bminus.setBackgroundResource(R.drawable.bg_white);
                bminus.setTextColor(Color.parseColor("#000000"));
                abplus.setBackgroundResource(R.drawable.bg_white);
                abplus.setTextColor(Color.parseColor("#000000"));
                abminus.setBackgroundResource(R.drawable.bg_white);
                abminus.setTextColor(Color.parseColor("#000000"));
                ominus.setBackgroundResource(R.drawable.bg_white);
                ominus.setTextColor(Color.parseColor("#000000"));
            }
        });
        ominus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ominus.setBackgroundResource(R.drawable.bg_red);
                ominus.setTextColor(Color.parseColor("#ffffff"));

                aminus.setBackgroundResource(R.drawable.bg_white);
                aminus.setTextColor(Color.parseColor("#000000"));
                aplus.setBackgroundResource(R.drawable.bg_white);
                aplus.setTextColor(Color.parseColor("#000000"));
                bplus.setBackgroundResource(R.drawable.bg_white);
                bplus.setTextColor(Color.parseColor("#000000"));
                bminus.setBackgroundResource(R.drawable.bg_white);
                bminus.setTextColor(Color.parseColor("#000000"));
                abplus.setBackgroundResource(R.drawable.bg_white);
                abplus.setTextColor(Color.parseColor("#000000"));
                abminus.setBackgroundResource(R.drawable.bg_white);
                abminus.setTextColor(Color.parseColor("#000000"));
                oplus.setBackgroundResource(R.drawable.bg_white);
                oplus.setTextColor(Color.parseColor("#000000"));
            }
        });






        return view;
    }





}

