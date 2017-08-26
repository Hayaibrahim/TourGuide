package layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.enghaya.tourguideapp.R;

import java.util.ArrayList;



public class UNVERSITY extends Fragment{

    public static String Name;

    public UNVERSITY(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_supermarket, container, false);

        ArrayList<UNVERSITY> listContact = GetlistContact();
        ListView lv = (ListView)getActivity().findViewById(R.id.supermarketid);

        return rootView;
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