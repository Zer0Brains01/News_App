package com.example.newslaytical.Models;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API {
@GET("top-headlines")
    Call<NewsApi> getApi(
            @Query("country") String country,
            @Query("pageSize") int pageSize,
            @Query("apiKey") String apiKey,
            @Query("category") String category
);
}
