package com.manish.covid_tracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import com.hbb20.CountryCodePicker;

import org.eazegraph.lib.charts.PieChart;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    CountryCodePicker countryCodePicker;

    TextView mtodaytotal, mtotal , mactive, mtodayactive, mrecovered, mtodayrecovered, mdeath, mtodaydeath;

    String country;
    TextView mfilter;
    Spinner spinner;
    String[] types = {"cases", "deaths", "recovered", "active"};
    private List<ModelClass> modelClassList;
    private List<ModelClass> modelClassList2;

    PieChart mpieChart;
    private RecyclerView recyclerView;
    Adapter adapter;


    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        countryCodePicker = findViewById(R.id.ccp);
        mtodayactive = findViewById(R.id.ccp);
        mactive = findViewById(R.id.ccp);
        countryCodePicker = findViewById(R.id.ccp);
        countryCodePicker = findViewById(R.id.ccp);
        countryCodePicker = findViewById(R.id.ccp);
        countryCodePicker = findViewById(R.id.ccp);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}