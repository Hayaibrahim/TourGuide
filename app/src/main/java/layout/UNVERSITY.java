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



public class UNVERSITY extends Fragment {

    public static String Name;

    public UNVERSITY() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View show = inflater.inflate( R.layout.fragment_unversity, container, false );
        ArrayList<information> info = new ArrayList<>();

        info.add( new information(getString(R.string.loacationunversity)," ",getString( R.string. university   ),"" ,getString( R.string.unversityaddress ) ));


        ListView clinicname = (ListView) show.findViewById( R.id.coffeeshopid );
        information tourAdapter = new information( show.getContext(), info );
        clinicname.setAdapter( (ListAdapter) tourAdapter );

        return show;
    }
}