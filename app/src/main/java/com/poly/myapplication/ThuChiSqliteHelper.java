package com.poly.myapplication;

import com.poly.myapplication.model.KhoanThuChi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThuChiSqliteHelper {
    // khoi tao bang, cau lenh tao bang va cau lenh truy van theo yeu cau

    public List<KhoanThuChi> getListThuChi(String type) {

        String truycan = "SELECT * from bangThuChi where type = '" + type + "'";

        List<KhoanThuChi> khoanThuChis = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            khoanThuChis.add(new KhoanThuChi("" + i, "Khoản thu từ nhiều nguồn",
                    new Random(10000000).nextFloat(), "A", System.currentTimeMillis() + ""));
        }
        return khoanThuChis;
    }

    // type = 1 : lay theo ngay
    // type = 2 : lay theo thang
    // type = 3 : lay theo thang
    public List<KhoanThuChi> getListThuChiTheoThoiGian(String type, String value) {
        List<KhoanThuChi> khoanThuChis = new ArrayList<>();

        return khoanThuChis;
    }

}
