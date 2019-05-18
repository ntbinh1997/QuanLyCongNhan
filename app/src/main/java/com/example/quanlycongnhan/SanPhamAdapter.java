package com.example.quanlycongnhan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class SanPhamAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<SanPhamPOJO> listSP;

    public SanPhamAdapter(Context context, int layout, List<SanPhamPOJO> listSanPham) {
        myContext = context;
        myLayout = layout;
        listSP = listSanPham;
    }

    @Override
    public int getCount() {
        return listSP.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(myLayout,null);
        TextView txtTenSP = (TextView) convertView.findViewById(R.id.textTenSP);
        TextView txtDonViTinh = (TextView) convertView.findViewById(R.id.textDonViTinhSP);
        TextView txtDonGia = (TextView) convertView.findViewById(R.id.textDonGiaSP);
        txtTenSP.setText(listSP.get(position).getTenSP());
        txtDonViTinh.setText(listSP.get(position).getDonViTinh());
        txtDonGia.setText(listSP.get(position).getDonGia());


        return null;
    }
}
