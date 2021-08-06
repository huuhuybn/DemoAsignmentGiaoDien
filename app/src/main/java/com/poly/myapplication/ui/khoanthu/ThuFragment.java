package com.poly.myapplication.ui.khoanthu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.poly.myapplication.R;
import com.poly.myapplication.ThuChiSqliteHelper;
import com.poly.myapplication.adapter.ThuChiAdapter;
import com.poly.myapplication.model.KhoanThuChi;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ThuFragment extends Fragment {

    private RecyclerView rcList;
    private ThuChiAdapter thuChiAdapter;
    private List<KhoanThuChi> khoanThuChis;
    private ThuChiSqliteHelper thuChiSqliteHelper;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rcList = view.findViewById(R.id.rvList);
        thuChiSqliteHelper = new ThuChiSqliteHelper();
        // truy van database
        khoanThuChis = thuChiSqliteHelper.getListThuChi("A");
        thuChiAdapter = new ThuChiAdapter(khoanThuChis);
        rcList.setAdapter(thuChiAdapter);
        rcList.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
}