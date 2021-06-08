package com.example.picrequest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.picrequest.Adapters.Adapter;
import com.example.picrequest.Models.Products;
import com.example.picrequest.RestApi.ManagerAll;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Adapter adp;
    List<Products> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        define();
        request();
    }

    private void define() {
        listView=findViewById(R.id.listview);
        list = new ArrayList<>();

    }

    public void request(){
        Call<List<Products>> x = ManagerAll.getInstance().getLists();
        x.enqueue(new Callback<List<Products>>() {
            @Override
            public void onResponse(Call<List<Products>> call, Response<List<Products>> response) {
                Log.i("oldu",response.body().toString());

                if(response.isSuccessful()){
                    list=response.body();
                    adp = new Adapter(MainActivity.this,MainActivity.this,list);
                    listView.setAdapter(adp);
                }


            }

            @Override
            public void onFailure(Call<List<Products>> call, Throwable t) {
                Log.i("hata",t.toString());
            }
        });
    }
}