package com.pinak_it_solution.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class FragmentSecond extends android.app.Fragment {
    TextView textView;
    String my_data;
    Context context;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second,container,false);
        if (savedInstanceState == null) {

        } else {
            my_data = savedInstanceState.getString("text");
            TextView textView = (TextView) view.findViewById(R.id.tv_fragment_view_text);
            textView.setText(my_data);
        }
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = (TextView) getActivity().findViewById(R.id.tv_fragment_view_text);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text",my_data);
    }

    public void ChangeData(String data){
        my_data = data;
        textView.setText(my_data);
    }
}
