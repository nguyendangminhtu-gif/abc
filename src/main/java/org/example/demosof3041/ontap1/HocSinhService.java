package org.example.demosof3041.ontap1;

import java.util.ArrayList;
import java.util.List;

public class HocSinhService {
    private final List<HocSinh> hocSinhs = new ArrayList<HocSinh>();

    public boolean themHocSinh(HocSinh hocSinh){
        if(hocSinh.getTen() == null || hocSinh.getTen().trim().isEmpty()){
            throw new IllegalArgumentException("Ten khong duoc de trong");
        }
        if(hocSinh.getTuoi() < 5 || hocSinh.getTuoi() > 18){
            throw new IllegalArgumentException("Tuoi phai nam trong khoang tu 5-10 tuoi");
        }
        if(hocSinh.getDiem() < 0 ||  hocSinh.getDiem() > 10){
            throw new IllegalArgumentException("Diem phai nam trong khoang tu 0-10 diem");
        }
        for(HocSinh hs : hocSinhs){
            if(hs.getId().equals(hocSinh.getId())){
                throw new IllegalArgumentException("Id da ton tai: " + hocSinh.getId());
            }
        }
        hocSinhs.add(hocSinh);
        return true;
    }

    public boolean suaHocSinh(Integer id, String tenMoi, Integer tuoiMoi, Float diemMoi){
        for(HocSinh hs : hocSinhs){
            if(hs.getId().equals(id)){
                if(tenMoi == null || tenMoi.trim().isEmpty()){
                    throw new IllegalArgumentException("Ten khong duoc de trong");
                }
                if(tuoiMoi < 5 || tuoiMoi > 18){
                    throw new IllegalArgumentException("Tuoi phai nam trong khoang tu 5-10 tuoi");
                }
                if(diemMoi < 0 || diemMoi > 10){
                    throw new IllegalArgumentException("Diem phai nam trong khoang tu 0-10 diem");
                }
                hs.setTen(tenMoi);
                hs.setTuoi(tuoiMoi);
                hs.setDiem(diemMoi);
                return true;
            }
        }
        throw new IllegalArgumentException("Khong tim thay hoc sinh voi id: "+id);
    }
}
