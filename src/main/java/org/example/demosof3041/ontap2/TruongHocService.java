package org.example.demosof3041.ontap2;

import java.util.ArrayList;
import java.util.List;

public class TruongHocService {
    public List<TruongHoc> truongHoc = new ArrayList<TruongHoc>();

    public boolean themTruongHoc(TruongHoc th) {
        if(th.getTen() == null || th.getTen().trim().isEmpty()) {
            throw new IllegalArgumentException("Ten truong hoc khong duoc de trong");
        }
        if(th.getDiaChi() == null || th.getDiaChi().trim().isEmpty()) {
            throw new IllegalArgumentException("Dia chi duoc de trong");
        }
        if(th.getSoLuongHS() == null ) {
            throw new IllegalArgumentException("So luong hoc sinh khong duoc de trong");
        }
        if(th.getSoLuongHS()<=0|| th.getSoLuongHS()>=1000){
            throw new IllegalArgumentException("So luong hoc sinh phai nam trong khoang tu 0-1000");
        }
        for(TruongHoc truonghoc: truongHoc){
            if(th.getId().equals(truonghoc.getId())){
                throw new IllegalArgumentException("Id nay da ton tai:" + truonghoc.getId());
            }
        }
        truongHoc.add(th);
        return true;
    }

    public boolean suaTruongHoc(String id,String tenMoi,String diaChiMoi,Integer soLuongHSMoi) {
        for(TruongHoc truonghoc: truongHoc){
            if(truonghoc.getId().equals(id)){
                if(tenMoi == null || tenMoi.trim().isEmpty()) {
                    throw new IllegalArgumentException("Ten truong hoc moi khong duoc de trong");
                }
                if(diaChiMoi == null || diaChiMoi.trim().isEmpty()) {
                    throw new IllegalArgumentException("Dia chi moi duoc de trong");
                }
                if(soLuongHSMoi == null ) {
                    throw new IllegalArgumentException("So luong hoc sinh moi khong duoc de trong");
                }
                if(soLuongHSMoi<=0|| soLuongHSMoi>=1000){
                    throw new IllegalArgumentException("So luong hoc sinh moi phai nam trong khoang tu 0-1000");
                }
                truonghoc.setTen(tenMoi);
                truonghoc.setDiaChi(diaChiMoi);
                truonghoc.setSoLuongHS(soLuongHSMoi);
                return true;
            }
        }
        throw new IllegalArgumentException("Khong tim thay truong hoc voi id:" +id);
    }
}
