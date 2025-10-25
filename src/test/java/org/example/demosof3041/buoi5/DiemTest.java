package org.example.demosof3041.buoi5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiemTest {
    private Diem diem;

    @BeforeEach
    void setUp() {diem = new Diem();}

    @Test
    public void PhanVungHopLe(){
        double ketQua = diem.tinhTB(8.0, 7.0, 9.0);
        assertEquals(8.0, ketQua);
    }

    @Test
    public void PhanVungKhongHopLe(){
        assertThrows(IllegalArgumentException.class,() -> diem.tinhTB(11.0, 7.0, 9.0));
    }

    @Test
    public void BienTren(){
        double ketQua = diem.tinhTB(10.0, 10.0, 10.0);
        assertEquals(10.0, ketQua);
    }

    @Test
    public void BienDuoi(){
        double ketQua = diem.tinhTB(1.0, 1.0, 1.0);
        assertEquals(1.0, ketQua);
    }

    @Test
    public void ChiaCho0(){
        assertThrows(ArithmeticException.class,() -> diem.tinhTB(null, null, null));
    }
}