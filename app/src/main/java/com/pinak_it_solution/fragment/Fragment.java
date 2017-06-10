package com.pinak_it_solution.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Micky on 6/8/2017.
 */

public class Fragment extends android.app.Fragment implements View.OnClickListener {
    Button buttonClickMe;
    int counter = 0;
    Communicator comm;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comm = (Communicator) getActivity();
        buttonClickMe = (Button) getActivity().findViewById(R.id.btn_fragment_click_me);
        buttonClickMe.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        counter++;
        comm.respond("button was clicked "+ counter +" time ");
    }
}
