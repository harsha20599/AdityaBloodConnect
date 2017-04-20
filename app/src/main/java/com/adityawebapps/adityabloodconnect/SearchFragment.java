package com.adityawebapps.adityabloodconnect;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SearchFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class SearchFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    Button aplus,aminus,bplus,bminus,abplus,abminus,oplus,ominus,finddonor;
    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);


        aplus = (Button) view.findViewById(R.id.a_plus);
        aminus = (Button) view.findViewById(R.id.a_minus);
        bplus = (Button) view.findViewById(R.id.b_plus);
        bminus = (Button) view.findViewById(R.id.b_minus);
        abplus = (Button) view.findViewById(R.id.ab_plus);
        abminus = (Button) view.findViewById(R.id.ab_minus);
        oplus = (Button) view.findViewById(R.id.o_plus);
        ominus = (Button) view.findViewById(R.id.o_minus);
        finddonor = (Button) view.findViewById(R.id.donor);
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
        finddonor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DonorResultsFragment donorResultsFragment= new DonorResultsFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.content_drawer, donorResultsFragment , donorResultsFragment.getTag()).commit();
            }
        });

        return view;
    }


    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
