package org.example.demosof3041.buoi3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {
    private SanPhamService service;

    @BeforeEach
    void setUp() {
        service = new SanPhamService();
        // thêm sẵn 1 sản phẩm để test sửa/xóa
        service.themSanPham(new SanPham("1", "SP01", "SP A", 1000, "Đỏ", "M", 10));
    }

    // TEST THÊM
    @Test
    void testThemSanPham_SoLuongBang0() {
        SanPham sp = new SanPham("2", "SP02", "SP B", 2000, "Xanh", "L", 0);
        assertThrows(IllegalArgumentException.class, () -> service.themSanPham(sp));
    }

    @Test
    void testThemSanPham_SoLuongBang1() {
        SanPham sp = new SanPham("3", "SP03", "SP C", 3000, "Vàng", "S", 1);
        assertTrue(service.themSanPham(sp));
    }

    @Test
    void testThemSanPham_SoLuongBang99() {
        SanPham sp = new SanPham("4", "SP04", "SP D", 4000, "Đen", "XL", 99);
        assertTrue(service.themSanPham(sp));
    }

    @Test
    void testThemSanPham_SoLuongBang100() {
        SanPham sp = new SanPham("5", "SP05", "SP E", 5000, "Trắng", "M", 100);
        assertThrows(IllegalArgumentException.class, () -> service.themSanPham(sp));
    }

    @Test
    void testThemSanPham_SoLuongAm() {
        SanPham sp = new SanPham("6", "SP06", "SP F", 6000, "Nâu", "L", -10);
        assertThrows(IllegalArgumentException.class, () -> service.themSanPham(sp));
    }

    // TEST SỬA
    @Test
    void testSuaSanPham_MaSaiKhongBatDauSP() {
        SanPham spMoi = new SanPham("1", "AA01", "SP A", 2000, "Đen", "L", 20);
        assertThrows(IllegalArgumentException.class, () -> service.suaSanPham("1", spMoi));
    }

    @Test
    void testSuaSanPham_MaBiTrung() {
        // thêm sp khác có mã SP02
        service.themSanPham(new SanPham("7", "SP02", "SP G", 7000, "Hồng", "S", 15));

        // sửa sp1 thành trùng mã SP02
        SanPham spMoi = new SanPham("1", "SP02", "SP A sửa", 2500, "Xanh", "XL", 30);
        assertThrows(IllegalArgumentException.class, () -> service.suaSanPham("1", spMoi));
    }

    @Test
    void testSuaSanPham_HopLe() {
        SanPham spMoi = new SanPham("1", "SP10", "SP A sửa", 3000, "Vàng", "M", 25);
        assertTrue(service.suaSanPham("1", spMoi));
    }

    // TEST XÓA
    @Test
    void testXoaSanPham_TonTai() {
        assertTrue(service.xoaSanPham("1")); // đã có sẵn trong setUp
    }

    @Test
    void testXoaSanPham_KhongTonTai() {
        assertFalse(service.xoaSanPham("999")); // id không tồn tại
    }
}