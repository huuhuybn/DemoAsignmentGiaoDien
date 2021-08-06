package com.poly.myapplication.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.poly.myapplication.R;

import org.jetbrains.annotations.NotNull;

public class ThuChiHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public TextView money;
    public TextView date;

    public ThuChiHolder(@NonNull @NotNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title);
        money = itemView.findViewById(R.id.money);
        date = itemView.findViewById(R.id.date);
    }
}
