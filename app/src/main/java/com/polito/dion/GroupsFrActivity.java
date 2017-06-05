package com.polito.dion;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by moose on 5/1/2017.
 */

public class GroupsFrActivity extends Fragment /*implements View.OnClickListener*/ {

    Button fABaddGroup;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.fractivity_groups, container, false);
/*
        fABaddGroup = (Button) view.findViewById(R.id.fABaddGroup);
        fABaddGroup.setOnClickListener(this);
*/


        return view;

    }
/*
    @Override
    public void onClick(View v) {
        Toast.makeText(this.getActivity(),
                "Button is clicked!", Toast.LENGTH_LONG).show();
    }
*/
    }
