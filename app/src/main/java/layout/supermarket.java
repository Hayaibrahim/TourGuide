package layout;

import android.content.Context;
import android.net.Uri;
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
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public static String Name;

    // TODO: Rename and change types of parameters


    public supermarket() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment supermarket.
     */
    // TODO: Rename and change types and number of parameters
    public static supermarket newInstance(String param1, String param2) {
        supermarket fragment = new supermarket();
        Bundle args = new Bundle();
        args.putString( ARG_PARAM1, param1 );
        args.putString( ARG_PARAM2, param2 );
        fragment.setArguments( args );
        return fragment;
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View show = inflater.inflate( R.layout.fragment_supermarket, container, false );
        ArrayList<information> info = new ArrayList<>();
        info.add( new information( "supermarket ", "alrawabe", "exit14", R.drawable.monuments ) );
        ListView clinicname = (ListView) show.findViewById( R.id.supermarketid );
        information tourAdapter = new information( show.getContext(), info );
        clinicname.setAdapter( (ListAdapter) tourAdapter );

        return show;
    }
}