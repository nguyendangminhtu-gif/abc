package org.example.demosof3041.buoi6;

public class TinhTong {
    public int TinhTongMangSoNguyen(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mang khong duoc de trong");
        }
        for (int so : arr) {
            if (so < 0 || so > 1000) {
                throw new IllegalArgumentException("Vui long nhap gia tri trong khoang tu 0 den 1000");
            }
        }
        int tong = 0;
        for (int so : arr) {
            tong += so;
        }
        return tong;
    }
}
