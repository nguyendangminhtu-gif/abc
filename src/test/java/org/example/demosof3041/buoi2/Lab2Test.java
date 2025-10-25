package org.example.demosof3041.buoi2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab2Test {
    private Lab2 lab2;

    @BeforeEach
    public void setup() {
        lab2 = new Lab2();
    }

    // TEST CHO PHƯƠNG THỨC TỔNG

    @Test
    void testTong_BienDuoi() {
        assertEquals(0, lab2.tong(0, 0));
    }

    @Test
    void testTong_BienDuoiKhongHopLe() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> lab2.tong(-1, 0));
        assertEquals("Số không được nhỏ hơn 0", ex.getMessage());
    }

    @Test
    void testTong_BienTren() {
        assertEquals(200, lab2.tong(100, 100));
    }

    @Test
    void testTong_BienTrenKhongHopLe() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> lab2.tong(101, 100));
        assertEquals("Số không được lớn hơn 100", ex.getMessage());
    }

    @Test
    void testTong_CanBienDuoiHopLe_1() {
        assertEquals(1, lab2.tong(0, 1));
    }

    @Test
    void testTong_CanBienDuoiHopLe_2() {
        assertEquals(1, lab2.tong(1, 0));
    }

    @Test
    void testTong_CanBienDuoiKhongHopLe_1() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> lab2.tong(-1, 1));
        assertEquals("Số không được nhỏ hơn 0", ex.getMessage());
    }

    @Test
    void testTong_CanBienDuoiKhongHopLe_2() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> lab2.tong(1, -1));
        assertEquals("Số không được nhỏ hơn 0", ex.getMessage());
    }

    @Test
    void testTong_CanBienTrenHopLe_1() {
        assertEquals(199, lab2.tong(99, 100));
    }

    @Test
    void testTong_CanBienTrenHopLe_2() {
        assertEquals(199, lab2.tong(100, 99));
    }

    @Test
    void testTong_CanBienTrenKhongHopLe_1() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> lab2.tong(101, 50));
        assertEquals("Số không được lớn hơn 100", ex.getMessage());
    }

    @Test
    void testTong_CanBienTrenKhongHopLe_2() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> lab2.tong(50, 101));
        assertEquals("Số không được lớn hơn 100", ex.getMessage());
    }

    @Test
    void testTong_HopLeBinhThuong() {
        assertEquals(100, lab2.tong(30, 70));
    }

    // TEST CHO PHƯƠNG THỨC CHIA

    @Test
    void testChia_BienDuoi() {
        assertEquals(0, lab2.chia(0, 1));
    }

    @Test
    void testChia_BienDuoiKhongHopLe() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> lab2.chia(-1, 1));
        assertEquals("Số không được nhỏ hơn 0", ex.getMessage());
    }

    @Test
    void testChia_BienTren() {
        assertEquals(1, lab2.chia(100, 100));
    }

    @Test
    void testChia_BienTrenKhongHopLe() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> lab2.chia(101, 1));
        assertEquals("Số không được lớn hơn 100", ex.getMessage());
    }

    @Test
    void testChia_CanBienDuoiHopLe_1() {
        assertEquals(1, lab2.chia(1, 1));
    }

    @Test
    void testChia_CanBienDuoiHopLe_2() {
        assertEquals(0, lab2.chia(0, 1));
    }

    @Test
    void testChia_CanBienDuoiKhongHopLe_1() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> lab2.chia(-1, 0));
        assertEquals("Số không được nhỏ hơn 0", ex.getMessage());
    }

    @Test
    void testChia_CanBienDuoiKhongHopLe_2() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> lab2.chia(1, -1));
        assertEquals("Số không được nhỏ hơn 0", ex.getMessage());
    }

    @Test
    void testChia_CanBienTrenHopLe_1() {
        assertEquals(1, lab2.chia(100, 100));
    }

    @Test
    void testChia_CanBienTrenHopLe_2() {
        assertEquals(100, lab2.chia(100, 1));
    }

    @Test
    void testChia_CanBienTrenKhongHopLe_1() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> lab2.chia(101, 50));
        assertEquals("Số không được lớn hơn 100", ex.getMessage());
    }

    @Test
    void testChia_CanBienTrenKhongHopLe_2() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> lab2.chia(50, 101));
        assertEquals("Số không được lớn hơn 100", ex.getMessage());
    }

    @Test
    void testChia_ChiaCho0() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> lab2.chia(50, 0));
        assertEquals("Không được chia cho 0", ex.getMessage());
    }

    @Test
    void testChia_HopLeBinhThuong() {
        assertEquals(25, lab2.chia(50, 2));
    }
}
