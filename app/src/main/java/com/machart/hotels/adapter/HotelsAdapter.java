package com.machart.hotels.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.machart.hotels.R;
import com.machart.hotels.activity.DetailsActivity;
import com.machart.hotels.model.Hotels;

import java.util.ArrayList;

public class HotelsAdapter extends RecyclerView.Adapter<HotelsAdapter.CustomViewHolder> {

    private ArrayList<Hotels> dataList;
    private Context context;

    public HotelsAdapter(Context context,ArrayList<Hotels> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        TextView txtTitle, textAddress, textEmail;
        ImageView imageView;

        CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            txtTitle = mView.findViewById(R.id.textTitle);
            textAddress = mView.findViewById(R.id.textAddress);
            textEmail = mView.findViewById(R.id.textEmail);
            imageView = mView.findViewById(R.id.imageView);
        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.adapter_hotels, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelsAdapter.CustomViewHolder holder, int position) {
        holder.txtTitle.setText(dataList.get(position).getName());
        holder.textAddress.setText(dataList.get(position).getAddress_1()+", "+dataList.get(position).getAddress_2());
        holder.textEmail.setText(dataList.get(position).getComm_email());

        Glide.with(context)
                .load(dataList.get(position).getImage())
                .placeholder(R.drawable.place_holder)
                .into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailsActivity.class);
                intent.putExtra("dataList", dataList);
                intent.putExtra("position", holder.getAdapterPosition());
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
