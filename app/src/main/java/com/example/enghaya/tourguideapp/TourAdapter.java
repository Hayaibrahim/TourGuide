package com.example.enghaya.tourguideapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ENG.HAYA on 8/26/2017 AD.
 */

public class TourAdapter  extends ArrayAdapter<information> {
        Context context;

public TourAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
        context=context;
        }
public View view(int position, View convertView, ViewGroup parent) {
        information info = getItem(position);
        if (convertView == null) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.image_text, parent, false);
        }
        ImageView image = (ImageView) convertView.findViewById(R.id.imageView);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView address = (TextView) convertView.findViewById(R.id.address
        );
        TextView location = (TextView) convertView.findViewById(R.id.loca);

        image.setImageResource(info.getImage());
        name.setText(info.getName());
        address.setText(info.getAddress());
        location.setText(info.getLocation());

        return convertView;
        }

        }



