package com.example.quanlycongnhan;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SanPham extends AppCompatActivity {
    TextView textView;
    ListView listView;
    List<SanPhamPOJO> listSP = new ArrayList<SanPhamPOJO>();
    SanPhamPOJO spMoi = new SanPhamPOJO ("gà 45kg","con","5 củ");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        listSP.add(new SanPhamPOJO ("gà 45kg","con","5 củ"));
        listSP.add(new SanPhamPOJO ("gà 55kg","1 shot","5 củ"));
        String tenSP[] = {"Sán phẩm 1","Sản phẩm 2"};
        String dongGia[] = {"1 kg","1shot"};
        String donViTinh[] = {"100đ","1000đ"};

        SanPhamAdapter adapter;
        adapter = new SanPhamAdapter(SanPham.this,R.layout.item_sanpham,listSP);
        listView.setAdapter(adapter);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_pham);
    }
}


