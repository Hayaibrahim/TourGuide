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


public class CLINIC extends Fragment {
public CLINIC(){

    }
    public static String Name;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View show = inflater.inflate(R.layout.fragment_clinic, container, false);

    ArrayList<information> info = new ArrayList<>();
    info.add( new information( "clinic ","aljazerah","haron alrashed road",R.drawable.monuments ) );
        ListView clinicname  = (ListView) show.findViewById(R.id.clinicid);
        information tourAdapter = new information(show.getContext(), info);
        clinicname.setAdapter( (ListAdapter) tourAdapter );

        return show;
    }
}