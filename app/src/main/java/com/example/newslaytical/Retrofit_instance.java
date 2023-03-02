package com.example.newslaytical;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit_instance {
private  static Retrofit retrofit;
private final String url="https://newsapi.org/v2/";

public Retrofit getRetrofit(){
    if(retrofit==null){
        retrofit=new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
    }
    return retrofit;
}

}
