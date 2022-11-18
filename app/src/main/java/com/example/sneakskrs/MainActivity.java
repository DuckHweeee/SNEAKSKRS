package com.example.sneakskrs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String LOG_TAG ="SNEAKSKRS";
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Shoes> shoes = getListData();
        this.recyclerView =(RecyclerView) this.findViewById(R.id.recyclerView);

        //Recycle View go vertical
        LinearLayoutManager linearLayoutManager  =new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
    private List<Shoes>getListData(){
        List<Shoes> list = new ArrayList<>();
        Shoes adidas = new Shoes("Adidas Stan Smith","adidas_shoes","adidas_logo","1.500.000VND");
        Shoes nike = new Shoes("Nike Air Jordan 1 Low x Travis Scott","nike_shoes","nike_logo","38.600.000VND");
        Shoes newb = new Shoes("NewBalance 2002R Navy","nb_shoes","nb_logo","6.900.000VND");

        list.add(adidas);
        list.add(nike);
        list.add(newb);
        return list;
    }
}