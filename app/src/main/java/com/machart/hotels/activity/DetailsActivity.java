package com.machart.hotels.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.machart.hotels.R;
import com.machart.hotels.model.Hotels;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {
    ArrayList<Hotels> dataList = new ArrayList<>();
    int position;
    TextView tvTitle, tvAddress, tvMobile, tvTelPhone, tvEmail;
    ImageView imageView, imageBackArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        dataList = (ArrayList<Hotels>) getIntent().getSerializableExtra("dataList");
        position = getIntent().getIntExtra("position",0);

        tvTitle = findViewById(R.id.tvTitle);
        tvAddress = findViewById(R.id.tvAddress);
        tvMobile = findViewById(R.id.tvMobile);
        tvTelPhone = findViewById(R.id.tvTelPhone);
        tvEmail = findViewById(R.id.tvEmail);
        imageView = findViewById(R.id.imageView);
        imageBackArrow = findViewById(R.id.imageBackArrow);

        tvTitle.setText(dataList.get(position).getName());
        tvAddress.setText(String.format("Address: %s, %s, %s", dataList.get(position).getAddress_1(), dataList.get(position).getAddress_2(), dataList.get(position).getPlace()));
        if(dataList.get(position).getMobile().length()>0)
            tvMobile.setText(String.format("Mobile: %s-%s", dataList.get(position).getCountry_code(), dataList.get(position).getMobile()));
        else
            tvMobile.setVisibility(View.GONE);
        tvTelPhone.setText(String.format("Tel: %s-%s", dataList.get(position).getStd_code(), dataList.get(position).getTelephone_1()));
        tvEmail.setText(String.format("Email %s", dataList.get(position).getComm_email()));

        Glide.with(this)
                .load(dataList.get(position).getImage())
                .placeholder(R.drawable.place_holder)
                .into(imageView);

        imageBackArrow.setOnClickListener(view -> finish());
    }
}