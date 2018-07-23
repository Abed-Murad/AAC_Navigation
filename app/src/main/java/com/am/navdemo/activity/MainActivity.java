package com.am.navdemo.activity;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.am.navdemo.R;
import com.am.navdemo.fragment.MainFragment;
import com.am.navdemo.fragment.SecondFragment;

public class MainActivity extends AppCompatActivity implements SecondFragment.OnFragmentInteractionListener, MainFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
