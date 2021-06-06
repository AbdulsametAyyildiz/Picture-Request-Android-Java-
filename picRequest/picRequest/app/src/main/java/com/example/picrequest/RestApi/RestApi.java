package com.example.picrequest.RestApi;

import com.example.picrequest.Models.Products;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {
    @GET("/productList.php")
    Call<List<Products>> getList();
}
