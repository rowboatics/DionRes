package com.polito.dion;

/**
 * Created by moose on 5/15/2017.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class IntroSlideActivity extends Fragment {

    private static final String ARG_LAYOUT_RES_ID = "layoutResId";

    public static IntroSlideActivity newInstance(int layoutResId) {
        IntroSlideActivity introSlideActivity = new IntroSlideActivity();

        Bundle args = new Bundle();
        args.putInt(ARG_LAYOUT_RES_ID, layoutResId);
        introSlideActivity.setArguments(args);

        return introSlideActivity;
    }

    private int layoutResId;

    public IntroSlideActivity() {}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getArguments() != null && getArguments().containsKey(ARG_LAYOUT_RES_ID))
            layoutResId = getArguments().getInt(ARG_LAYOUT_RES_ID);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(layoutResId, container, false);
    }

}