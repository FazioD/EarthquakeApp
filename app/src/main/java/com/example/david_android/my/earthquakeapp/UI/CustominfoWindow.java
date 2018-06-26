package com.example.david_android.my.earthquakeapp.UI;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.david_android.my.earthquakeapp.R;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class CustominfoWindow implements GoogleMap.InfoWindowAdapter {
    private View view;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustominfoWindow(Context context) {
        this.context = context;

        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.custom_info_window, null);
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {

        TextView title = (TextView) view.findViewById(R.id.winTitle);
        title.setText(marker.getTitle());

        TextView magnitude = (TextView) view.findViewById(R.id.magnitude);
        magnitude.setText(marker.getSnippet());
        return view;
    }
}
