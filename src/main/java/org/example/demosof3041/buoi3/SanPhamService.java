package org.example.demosof3041.buoi3;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private final List<SanPham> danhSach = new ArrayList<>();

    public boolean themSanPham(SanPham sp) {
        if (sp.getSoLuong() <= 0 || sp.getSoLuong() >= 100) {
            throw new IllegalArgumentException("Số lượng phải >0 và <100");
        }
        for (SanPham s : danhSach) {
            if (s.getMaSanPham().equals(sp.getMaSanPham())) {
                throw new IllegalArgumentException("Mã sản phẩm đã tồn tại");
            }
        }
        danhSach.add(sp);
        return true;
    }

    public boolean suaSanPham(String id, SanPham spMoi) {
        for (SanPham sp : danhSach) {
            if (sp.getId().equals(id)) {
                if (!spMoi.getMaSanPham().startsWith("SP")) {
                    throw new IllegalArgumentException("Mã sản phẩm phải bắt đầu bằng SP");
                }
                for (SanPham s : danhSach) {
                    if (!s.getId().equals(id) && s.getMaSanPham().equals(spMoi.getMaSanPham())) {
                        throw new IllegalArgumentException("Mã sản phẩm đã tồn tại");
                    }
                }
                sp.setMaSanPham(spMoi.getMaSanPham());
                sp.setTenSanPham(spMoi.getTenSanPham());
                sp.setGia(spMoi.getGia());
                sp.setMauSac(spMoi.getMauSac());
                sp.setKichThuoc(spMoi.getKichThuoc());
                sp.setSoLuong(spMoi.getSoLuong());
                return true;
            }
        }
        return false;
    }

    public boolean xoaSanPham(String id) {
        return danhSach.removeIf(sp -> sp.getId().equals(id));
    }

    public List<SanPham> getDanhSach() {
        return danhSach;
    }
}
