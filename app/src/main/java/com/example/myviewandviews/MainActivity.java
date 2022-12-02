package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Laptop Mevvah");
        }
        Button buy = findViewById(R.id.buy);
        buy.setOnClickListener(this);
        Button cscall = findViewById(R.id.contact);
        cscall.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buy:
                Intent moveIntent = new Intent(MainActivity.this, BuyActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.contact:
                String phoneNumber = "087877796540";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("Telp:" + phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}
