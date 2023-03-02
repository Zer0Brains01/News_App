package com.example.newslaytical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class MainActivity2 extends AppCompatActivity {
WebView w1;
ProgressBar p1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
w1=findViewById(R.id.web);
p1=findViewById(R.id.prgress);
        Intent i2=getIntent();
       String url= i2.getStringExtra("URL");
w1.loadUrl(url);
w1.setWebViewClient(new WebViewClient() {
                        @Override
                        public void onPageStarted(WebView view, String url, Bitmap favicon) {
                            p1.setVisibility(View.VISIBLE);
                            super.onPageStarted(view, url, favicon);
                        }

                        @Override
                        public void onPageFinished(WebView view, String url) {
                            p1.setVisibility(View.GONE);
                            super.onPageFinished(view, url);
                        }
                    });
    }

    @Override
    public void onBackPressed() {
        if(w1.canGoBack()){
            w1.goBack();
        }else
        super.onBackPressed();
    }
}