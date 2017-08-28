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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ENG.HAYA on 8/26/2017 AD.
 */

public class TourAdapter extends ArrayAdapter<information> {
     Context mcontext;

    public  TourAdapter (Context context , ArrayList<information> item){
        super(context, 0 , item);
        mcontext =context ;

    }



    public View view(int position, View view, ViewGroup parent) {
        information info = getItem( position );
        if (view == null) {
            view = LayoutInflater.from( getContext() ).inflate( R.layout.image_text, parent, false );
        }
        ImageView image = (ImageView) view.findViewById( R.id.imageView );
        TextView name = (TextView) view.findViewById( R.id.name );
        TextView address = (TextView) view.findViewById( R.id.address
        );
        TextView location = (TextView) view.findViewById( R.id.loca );

        image.setImageResource( info.getImage() );
        name.setText( info.getName() );
        address.setText( info.getAddress() );
        location.setText( info.getLocation() );

        return view;
    }

}



