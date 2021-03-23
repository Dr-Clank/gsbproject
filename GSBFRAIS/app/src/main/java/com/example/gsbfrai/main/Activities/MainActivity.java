package com.example.gsbfrai.main.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.gsbfrai.R;
import com.example.gsbfrai.main.Adapters.RecyclerViewVisitorAdapter;
import com.example.gsbfrai.main.Gson.GsonRequest;
import com.example.gsbfrai.main.Gson.VolleyHelper;
import com.example.gsbfrai.main.Listners.RecyclerTouchVisitorListener;
import com.example.gsbfrai.main.Models.Praticien;
import com.example.gsbfrai.main.Models.Praticiens;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Praticien> dataPraticien;
    private RecyclerViewVisitorAdapter adapter;

    private final String exempleUrl = "http://192.168.210.11/cakephp/index.php/praticiens.json";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvVisitor);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setFocusable(false);


        setDatas();

        /*recyclerView.addOnItemTouchListener(new RecyclerTouchVisitorListener(this, recyclerView, ((view, position) -> {
            Monuments monMonument = dataMonuments.get(position);
            Intent detail = new Intent(getApplicationContext(), ConseilActivity.class);
            detail.putExtra("MONUMENT_DETAIL", monMonument);
            detail.putExtra("BOOLEAN",false);
            startActivity(detail);
        })));*/
        final GsonRequest gsonRequest= new GsonRequest(exempleUrl, Praticiens.class, null, new Response.Listener<Praticiens>() {
            @Override
            public void onResponse(Praticiens praticiens) {

                for (Praticien praticien : praticiens.getPraticiens()) {
                    dataPraticien.add(praticien);
                    recyclerView.setAdapter(adapter);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                if(volleyError != null) Log.e("MainActivity", volleyError.getMessage());
            }
        });
        VolleyHelper.getInstance(getApplicationContext()).addToRequestQueue(gsonRequest);
        adapter = new RecyclerViewVisitorAdapter(dataPraticien);
    }


    private void setDatas() {
        dataPraticien = new ArrayList<Praticien>();
    }
}