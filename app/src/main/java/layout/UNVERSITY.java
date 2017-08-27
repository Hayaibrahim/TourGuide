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



public class UNVERSITY extends Fragment{

    public static String Name;

    public UNVERSITY(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View show = inflater.inflate(R.layout.fragment_unversity,container,false);
        ArrayList<information> info = new ArrayList<>();
        info.add( new information( "Unversity pnu","narjes","near airport king khalid international",R.drawable.monuments ) );
        ListView clinicname  = (ListView) show.findViewById(R.id.universityid);
        information tourAdapter = new information(show.getContext(), info);
        clinicname.setAdapter( (ListAdapter) tourAdapter );

        return show;
    }


    private ArrayList<UNVERSITY> GetlistContact(){
        ArrayList<UNVERSITY> contactlist = new ArrayList<UNVERSITY>();

        UNVERSITY contact = new UNVERSITY();

        contact.SetName("Topher");
        contact.SetPhone("01213113568");
        contactlist.add(contact);

        contact = new UNVERSITY();
        contact.SetName("Jean");
        contact.SetPhone("01213869102");
        contactlist.add(contact);

        contact = new UNVERSITY();
        contact.SetName("Andrew");
        contact.SetPhone("01213123985");
        contactlist.add(contact);

        return contactlist;
    }

    private void SetPhone(String s) {
    }

    private void SetName(String topher) {
    }}