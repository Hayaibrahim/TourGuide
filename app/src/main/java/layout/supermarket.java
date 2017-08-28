package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.enghaya.tourguideapp.R;
import com.example.enghaya.tourguideapp.information;

import java.util.ArrayList;

public class supermarket extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View show = inflater.inflate( R.layout.fragment_supermarket, container, false );
        ArrayList<information> info = new ArrayList<>();

        info.add( new information(getString(R.string.loacationsupermarket)," ",getString( R.string.supermarket   ),"" ,getString( R.string.supermarketaddress ) ));


        ListView clinicname = (ListView) show.findViewById( R.id.coffeeshopid );
        information tourAdapter = new information( show.getContext(), info );
        clinicname.setAdapter( (ListAdapter) tourAdapter );

        return show;

    }
}