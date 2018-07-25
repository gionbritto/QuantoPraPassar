package com.projeto.fragment2.fragment_modificado;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void FragmentOneClick(View view) {
        Fragment myfragmentone;
        myfragmentone = new FragmentOne();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_switch, myfragmentone);
        fragmentTransaction.commit();

    }
    public void FragmentTwoClick(View view) {
        Fragment myfragmenttwo;
        myfragmenttwo = new FragmentTwo();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_switch, myfragmenttwo);
        fragmentTransaction.commit();

    }

    public void FragmentThreeClick(View view) {
        Fragment myfragment;
        myfragment = new FragmentThree();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_switch, myfragment);
        fragmentTransaction.commit();

    }

}
