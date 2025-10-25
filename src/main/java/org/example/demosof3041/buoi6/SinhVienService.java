package org.example.demosof3041.buoi6;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    public List<SinhVien> listSV =  new ArrayList<SinhVien>();

    public void Sua(SinhVien sinhVien){
        int viChi = -1;
        if (sinhVien == null ){
            throw new IllegalArgumentException("Vui long nhap thong tin sinh vien");
        }
        if (sinhVien.getDiemTrungBinh() == null
                || sinhVien.getMaSV() == null || sinhVien.getMaSV().isEmpty()
                || sinhVien.getChuyenNganh().isEmpty() || sinhVien.getChuyenNganh() == null
                || sinhVien.getKyHoc() == null
                || sinhVien.getTen()== null || sinhVien.getTen().isEmpty()
                || sinhVien.getTuoi()==null){
            throw new IllegalArgumentException("Vui long nhap day du thong tin");
        }
        if (sinhVien.getDiemTrungBinh()<0||sinhVien.getDiemTrungBinh()>10){
            throw new IllegalArgumentException("Vui long nhap diem trong khoan du 0 den 10");
        }
        for (int i =0; i<listSV.size(); i++){
            if (listSV.get(i).getMaSV().equals(sinhVien.getMaSV())){
                viChi = i;
            }
        }
        listSV.set(viChi, sinhVien);
    }
}
