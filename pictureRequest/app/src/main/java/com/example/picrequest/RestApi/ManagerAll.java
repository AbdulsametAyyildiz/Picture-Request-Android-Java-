package com.example.picrequest.RestApi;

import com.example.picrequest.Models.Products;

import java.util.List;

import retrofit2.Call;

public class ManagerAll extends BaseManager {
    private static ManagerAll ourInstance = new ManagerAll();

    public static synchronized ManagerAll getInstance() {
        return ourInstance;
    }

    public Call<List<Products>> getLists(){
        Call<List<Products>> x = getRestApi().getList();
        return x;
    }
}
