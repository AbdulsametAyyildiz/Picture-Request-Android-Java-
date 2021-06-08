package com.example.picrequest.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.picrequest.Models.Products;
import com.example.picrequest.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter extends BaseAdapter {

    Context context;
    Activity activity;
    List<Products> list;

    public Adapter(Context context, Activity activity, List<Products> list) {
        this.context = context;
        this.activity = activity;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.listlayout,parent,false);
        TextView productName, productCost;
        ImageView imageView = convertView.findViewById(R.id.imageView);
        productName=convertView.findViewById(R.id.productName);
        productCost=convertView.findViewById(R.id.productCost);

        productName.setText(list.get(position).getProductName());
        productCost.setText(list.get(position).getProductCost());

        Picasso.get().load("**your site link**"+list.get(position).getProductPic()).into(imageView);

        return convertView;
    }
}
