package org.example.demosof3041.buoi4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SanPham {
    private String id;
    private String maSanPham;
    private  String tenSanpham;
    private  String mauSac;
    private String kichThuoc;
    private float gia;
    private int soLuong;
}
