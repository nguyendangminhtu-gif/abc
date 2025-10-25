package org.example.demosof3041.buoi4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {
    private SanPhamService service;

    @BeforeEach
    public void setUp() {
        service = new SanPhamService();
    }

    @Test
    public void them_giatribiensoluongla99() {
        SanPham sp = new SanPham("1", "SP001", "Quan jean", "xanh", "S", 270.0f, 99);
        assertTrue(service.them(sp));
    }

    @Test
    public void them_giatribiensoluongla98() {
        SanPham sp = new SanPham("1", "SP001", "Quan jean", "xanh", "S", 270.0f, 98);
        assertTrue(service.them(sp));
    }

    @Test
    public void them_giatribiensoluongla0() {
        SanPham sp = new SanPham("1", "SP001", "Quan jean", "xanh", "S", 270.0f, 0);
        assertThrows(IllegalArgumentException.class, () -> service.them(sp));
    }

    @Test
    public void themgiatribiensoluonglaam1() {
        SanPham sp = new SanPham("1", "SP001", "Quan jean", "xanh", "S", 270.5f, -1);
        assertThrows(IllegalArgumentException.class, () -> service.them(sp));
    }

    @Test
    public void them_giatribiensoluongla100() {
        SanPham sp = new SanPham("1", "SP001", "Quan jean", "xanh", "S", 270.0f, 100);
        assertThrows(IllegalArgumentException.class, () -> service.them(sp));
    }

    @Test
    public void them_giatribiensoluongla101() {
        SanPham sp = new SanPham("1", "SP001", "Quan jean", "xanh", "S", 270.0f, 101);
        assertThrows(IllegalArgumentException.class, () -> service.them(sp));
    }

    @Test
    public void sua_Masanphamhople() {
        SanPham sp = new SanPham("2", "SP002", "ao phong", "trang", "M", 220.0f, 10);
        service.them(sp);
        SanPham spMoi = new SanPham("2", "SP999", "ao somi", "do", "l", 260.0f, 15);
        assertTrue(service.sua("2", spMoi));
    }

    @Test
    public void sua_khongdungdinhdang() {
        SanPham sp = new SanPham("2", "SP002", "ao phong", "trang", "M", 220.0f, 10);
        service.them(sp);
        SanPham spMoi = new SanPham("2", "AP999", "ao somi", "do", "l", 260.0f, 15);
        assertThrows(IllegalArgumentException.class, () -> service.sua("2", spMoi));

    }
}