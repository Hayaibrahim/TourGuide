package layout;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.enghaya.tourguideapp.R;
import com.example.enghaya.tourguideapp.information;

import java.util.ArrayList;

import static layout.supermarket.Name;

/**
 * Created by ENG.HAYA on 8/21/2017 AD.
 */

public class list extends FragmentPagerAdapter {

    int numberpage = 4;
    Context context;
    String page[] = new String[]{
            Name,
            coffeeshope.Name,
            CLINIC.Name,
            UNVERSITY.Name};

    public list(FragmentManager fm, Context context1) {

        super(fm);
        context = context1;
    }





    @Override
    public int getCount() {
        return numberpage;
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }
}



   /* ArrayList<information> mydata;
    Context context;

    list(Context context) {
        this.context = context;
        mydata = new ArrayList<information>();
        mydata.add(new information("King fahad road ", "alrayadh", "aljazearah ", R.drawable.monuments));
        mydata.add(new information("King slaman road ", "alrayadh", "aljazearah ", R.drawable.v));
        mydata.add(new information("King khalid road ", "alrayadh", "aljazearah ", R.drawable.u));
        mydata.add(new information("King mohammed road ", "alrayadh", "aljazearah ", R.drawable.paris));

    }

    @Override
    public int getCount() {
        return mydata.size();
    }

    @Override
    public Object getItem(int position) {
        return mydata.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getItem(position);
        View row = inflater(R.layout.fragment_unversity, parent, false);
        TextView name = (TextView) row.findViewById(R.id.name);
        TextView address = (TextView) row.findViewById(R.id.address);
        ImageView pic = (ImageView) row.findViewById(R.id.imageView);

        information key = mydata.get(position);
        name.setText(key.name);
        address.setText(key.address);
        pic.setImageResource(key.image);


        return row;
    }

    private View inflater(int fragment_clinic, ViewGroup parent, boolean b) {


        return null;
    }}}
*/