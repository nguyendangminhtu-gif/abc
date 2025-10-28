package org.example.demosof3041.ontap3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KiemTraSoNguyenDuongTest {
    KiemTraSoNguyenDuong kiemTraSoNguyenDuong;
    @BeforeEach
    void setUp() {
        kiemTraSoNguyenDuong = new KiemTraSoNguyenDuong();
    }

    @Test
    public void Testcase1_HopLe(){
        int num =5;
        assertEquals(5,kiemTraSoNguyenDuong.checkSoNguyenDuong(num));
    }

    @Test
    public void Testcase2_BienDuoi(){
        int num =1;
        assertEquals(1,kiemTraSoNguyenDuong.checkSoNguyenDuong(num));
    }

    @Test
    public void Testcase3_BienTren(){
        int num =100;
        assertEquals(100,kiemTraSoNguyenDuong.checkSoNguyenDuong(num));
    }

    @Test
    public void Testcase4_Null(){
        int num =0;
        assertThrows(IllegalArgumentException.class,() -> kiemTraSoNguyenDuong.checkSoNguyenDuong(num));
    }

    @Test
    public void Testcase5_KhongHopLe(){
        int num =200;
        assertThrows(IllegalArgumentException.class,() -> kiemTraSoNguyenDuong.checkSoNguyenDuong(num));
    }
}