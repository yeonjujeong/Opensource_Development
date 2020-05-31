package com.example.weather_forecast;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.weather_forecast.R;

public class DetailFragment extends Fragment {

    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle data = getArguments();
        String detailData = null;
        if (data != null) {
            detailData = data.getString("data");
        }

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.detail_fragment, container, false);

        TextView detailTextView = (TextView)rootView.findViewById(R.id.detail_fragment);
        detailTextView.setText(detailData);

        return rootView;
    }

}
