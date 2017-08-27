package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jayanth on 26-08-2017.
 */

public class EarthQuakeAdapter extends ArrayAdapter<EarthQuake> {
    private static final String LOG_TAG = EarthQuakeAdapter.class.getSimpleName();


    public EarthQuakeAdapter(Activity context, ArrayList<EarthQuake> earthquakes) {

        super(context, 0, earthquakes);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        EarthQuake currentEarthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView Mag = (TextView) listItemView.findViewById(R.id.magnitude);

        Mag.setText(currentEarthquake.getCityName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.city);

        numberTextView.setText(currentEarthquake.getMagnitude());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        TextView iconView = (TextView) listItemView.findViewById(R.id.earthquake_date);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setText(currentEarthquake.getdate());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}


