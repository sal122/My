package com.m_saleem.my;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv_main);
        ArrayList<cat> cats=new ArrayList<>();


        for (int i=0 ; i<30; i++){
            cats.add(new cat("cat"+i));
        }





        rvADAPTER adap =new rvADAPTER(cats);
        RecyclerView.LayoutManager m = new LinearLayoutManager(this);
        rv.setLayoutManager(m);
        rv.setAdapter(adap);
        rv.setHasFixedSize(true);









    }
}