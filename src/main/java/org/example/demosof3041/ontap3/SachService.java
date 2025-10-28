package org.example.demosof3041.ontap3;

import java.util.ArrayList;
import java.util.List;

public class SachService {
    public List<Sach> sach1 =  new ArrayList<Sach>();
    public boolean update (String maSach, String tenSachMoi, String tenTacGiaMoi, Integer namXuatBanMoi, Float giaMoi){
        for(Sach sach : sach1){
            if(sach.getMaSach().equals(maSach)){
                if(tenSachMoi==null && tenSachMoi.trim().isEmpty()||tenTacGiaMoi==null && tenTacGiaMoi.trim().isEmpty()|| namXuatBanMoi==null && namXuatBanMoi==0|| giaMoi==null && giaMoi==0){
                    throw new IllegalArgumentException("Cac truong khong duoc de trong");
                }
                if(namXuatBanMoi<1990 && namXuatBanMoi>2025){
                    throw new IllegalArgumentException("Nam xuat ban phai >1990 va <2025");
                }
            }
            sach.setTenSach(tenSachMoi);
            sach.setTacGia(tenTacGiaMoi);
            sach.setNamXuatBan(namXuatBanMoi);
            sach.setGia(giaMoi);
            return true;
        }
        throw new IllegalArgumentException("Khong tim thay sach voi ma sach la:" +maSach);
    }
}
