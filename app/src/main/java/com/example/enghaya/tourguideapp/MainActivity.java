package com.example.enghaya.tourguideapp;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import layout.CLINIC;

public class MainActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        ListView listView = (ListView) findViewById( R.id.supermarketid );

        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter( getSupportFragmentManager() );

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById( R.id.container );
        mViewPager.setAdapter( mSectionsPagerAdapter );

        TabLayout tabLayout = (TabLayout) findViewById( R.id.tabs );
        tabLayout.setupWithViewPager( mViewPager );

    }


    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt( ARG_SECTION_NUMBER, sectionNumber );
            fragment.setArguments( args );
            return fragment;
        }


    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super( fm );
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance( position + 1 );
        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "CLINIC";
                case 1:
                    return "UNVERSITY";
                case 2:
                    return "SUPER MARKET";
                case 3:
                    return "COFFEE SHOP";
            }
            return null;
        }
    }

    public void onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate( R.layout.fragment_clinic, container, false );
        PullToZoomListView listView = null;
        String[] adapterData;

        ListView clinicname = (ListView) findViewById( R.id.clinicid );
        adapterData = new String[]{"Activity", "Service", "Content Provider", "Intent", "BroadcastReceiver",
                "ADT", "Sqlite3", "HttpClient", "DDMS", "Android Studio", "Fragment", "Loader",
                "ADT", "Sqlite3", "HttpClient", "DDMS", "Android Studio", "Fragment", "Loader"};
        listView.setAdapter( new ArrayAdapter<>( MainActivity.this, android.R.layout.simple_list_item_1, adapterData ) );
        listView.getHeaderView().setImageResource( R.drawable.paris );
        listView.getHeaderView().setScaleType( ImageView.ScaleType.CENTER_CROP );
        listView.setShadow( R.drawable.monuments );
        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText( MainActivity.this, "click index:" + position, Toast.LENGTH_SHORT ).show();
            }
        } );

    }

    private class PullToZoomListView {
        private ImageView headerView;
        private int shadow;
        private ArrayAdapter<String> adapter;

        public ImageView getHeaderView() {
            return headerView;
        }

        public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {


        }

        public void setShadow(int shadow) {
            this.shadow = shadow;
        }

        public void setAdapter(ArrayAdapter<String> adapter) {
            this.adapter = adapter;
        }
    }
}