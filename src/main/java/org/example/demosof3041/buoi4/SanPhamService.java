package org.example.demosof3041.buoi4;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private final List<SanPham> danhsach = new ArrayList<>();

    public boolean them(SanPham sp) {
        if (sp.getSoLuong() <= 0 || sp.getSoLuong() >= 100)
            throw new IllegalArgumentException("so luong trong khoang tu 1-99");
        return danhsach.add(sp);
    }

    public boolean sua(String id, SanPham spMoi) {
        for (SanPham sp : danhsach) {
            if (sp.getId().equals(id)) {
                if (!spMoi.getMaSanPham().startsWith("SP")) throw new IllegalArgumentException("ma bat dau la 'SP'");
                if (danhsach.stream().anyMatch(p -> p.getMaSanPham().equals(spMoi.getMaSanPham()) && !p.getId().equals(id)))
                    throw new IllegalArgumentException("Ma san pham ko duoc trung");
                sp.setMaSanPham(spMoi.getMaSanPham());
                sp.setSoLuong(spMoi.getSoLuong());
                return true;
            }
        }
        return false;
    }

    public void SuaSanPham(SanPham sanPham){
        if (sanPham == null || sanPham.getMaSanPham() == null) {
            throw new IllegalArgumentException("Sản phẩm không hợp lệ");
        }
        if (!sanPham.getMaSanPham().startsWith("SP")) {
            throw new IllegalArgumentException("Mã sản phẩm phải bắt đầu bằng SP");
        }
        int Vichi = -1;
        for (int i =0; i< danhsach.size(); i++){
            if (danhsach.get(i).getMaSanPham().equals(sanPham.getMaSanPham())){
                Vichi = i;
            }
        }
        if (Vichi == -1) {
            throw new IllegalArgumentException("Không tìm thấy sản phẩm để sửa");
        }

        for (SanPham sp : danhsach) {
            if (!sp.getId().equals(sanPham.getId()) &&
                    sp.getMaSanPham().equalsIgnoreCase(sanPham.getMaSanPham())) {
                throw new IllegalArgumentException("Mã sản phẩm phải là duy nhất");
            }
        }

        danhsach.set(Vichi, sanPham);
    }
}
