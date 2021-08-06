package com.poly.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.poly.myapplication.R;
import com.poly.myapplication.model.KhoanThuChi;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ThuChiAdapter extends RecyclerView.Adapter<ThuChiHolder> {


    private List<KhoanThuChi> khoanThuChis;

    public ThuChiAdapter(List<KhoanThuChi> khoanThuChis) {
        this.khoanThuChis = khoanThuChis;
    }

    @NonNull
    @NotNull
    @Override
    public ThuChiHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.thu_chi, parent, false);
        ThuChiHolder thuChiHolder = new ThuChiHolder(view);
        return thuChiHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ThuChiHolder holder, int position) {
        KhoanThuChi khoanThuChi = khoanThuChis.get(position);
        holder.title.setText(khoanThuChi.title);
        holder.date.setText(khoanThuChi.date);
        holder.money.setText(String.valueOf(khoanThuChi.money));
    }

    @Override
    public int getItemCount() {
        return khoanThuChis.size();
    }
}
