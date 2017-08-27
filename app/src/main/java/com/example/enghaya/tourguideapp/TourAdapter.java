package com.example.enghaya.tourguideapp;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ENG.HAYA on 8/26/2017 AD.
 */

public class TourAdapter  extends ArrayAdapter<information> {
        Context context;

        public TourAdapter(@NonNull Context context, @LayoutRes int resource) {
                super( context, resource );
        }

        public TourAdapter(@NonNull Context context, @LayoutRes int resource, @IdRes int textViewResourceId) {
                super( context, resource, textViewResourceId );
        }

        public TourAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull information[] objects) {
                super( context, resource, objects );
        }

        public TourAdapter(@NonNull Context context, @LayoutRes int resource, @IdRes int textViewResourceId, @NonNull information[] objects) {
                super( context, resource, textViewResourceId, objects );
        }

        public TourAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<information> objects) {
                super( context, resource, objects );
        }

        public TourAdapter(@NonNull Context context, @LayoutRes int resource, @IdRes int textViewResourceId, @NonNull List<information> objects) {
                super( context, resource, textViewResourceId, objects );
        }



public View view(int position, View view, ViewGroup parent) {
        information info = getItem(position);
        if (view == null) {
                view = LayoutInflater.from(getContext()).inflate(R.layout.image_text, parent, false);
        }
        ImageView image = (ImageView) view.findViewById(R.id.imageView);
        TextView name = (TextView) view.findViewById(R.id.name);
        TextView address = (TextView) view.findViewById(R.id.address
        );
        TextView location = (TextView) view.findViewById(R.id.loca);

        image.setImageResource(info.getImage());
        name.setText(info.getName());
        address.setText(info.getAddress());
        location.setText(info.getLocation());

        return view;
        }

        }



