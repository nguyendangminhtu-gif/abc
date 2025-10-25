package org.example.demosof3041.ontap2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MayTinhTest {
    MayTinh mayTinh;

    @BeforeEach
    void  setUp() {
        mayTinh = new MayTinh();
    }

    @Test
    public void TinhTongHopLe(){
        int ketQua = mayTinh.tong(3,3);
        assertEquals(6,ketQua);
    }

    @Test
    public void TinhTongHopLe_TaiBienDuoi1(){
        int ketQua = mayTinh.tong(1,1);
        assertEquals(2,ketQua);
    }

    @Test
    public void TinhTongHopLe_TaiBienTren99(){
        int ketQua = mayTinh.tong(99,99);
        assertEquals(198,ketQua);
    }

    @Test
    public void TinhTongKhongHopLe_NhapSoAm(){
        assertThrows(IllegalArgumentException.class, () -> mayTinh.tong(-1,-2));
    }

    @Test
    public void TinhTongKhongHopLe_NhapSoLonHon100(){
        assertThrows(IllegalArgumentException.class, () -> mayTinh.tong(101,102));
    }

    @Test
    public void TinhHieuHopLe(){
        int ketQua =  mayTinh.hieu(3,3);
        assertEquals(0,ketQua);
    }

    @Test
    public void TinhHieuHopLe_TaiBienCanBienDuoi2(){
        int ketQua =  mayTinh.hieu(2,2);
        assertEquals(0,ketQua);
    }

    @Test
    public void TinhHieuKhongHopLe_DeTrong(){
        assertThrows(IllegalArgumentException.class, () -> mayTinh.hieu(null,null));
    }

    @Test
    public void TinhHieuKhongHopLe_SoAm(){
        assertThrows(IllegalArgumentException.class, () -> mayTinh.hieu(-1,-2));
    }

    @Test
    public void TinhHieuKhongHopLe_SoLonHon100(){
        assertThrows(IllegalArgumentException.class, () -> mayTinh.hieu(101,102));
    }

    @Test
    public void TinhTichHopLe(){
        int ketQua =   mayTinh.tich(3,3);
        assertEquals(9,ketQua);
    }

    @Test
    public void  TinhTichHopLe_TaiBienDuoi1(){
        int ketQua =  mayTinh.tich(1,1);
        assertEquals(1,ketQua);
    }

    @Test
    public void TinhTichKhongHopLe_DeTrong(){
        assertThrows(IllegalArgumentException.class, () -> mayTinh.tich(null,null));
    }

    @Test
    public void TinhTichKhongHopLe_SoAm(){
        assertThrows(IllegalArgumentException.class, () -> mayTinh.tich(-1,-2));
    }

    @Test
    public void TinhTichKhongHopLe_SoLonHon100(){
        assertThrows(IllegalArgumentException.class, () -> mayTinh.tich(101,102));
    }

    @Test
    public void TinhThuongHopLe(){
        int ketQua =   mayTinh.thuong(3,3);
        assertEquals(1,ketQua);
    }

    @Test
    public void  TinhThuongHopLe_TaiBienDuoi1(){
        int ketQua =  mayTinh.thuong(1,1);
        assertEquals(1,ketQua);
    }

    @Test
    public void TinhThuongKhongHopLe_DeTrong(){
        assertThrows(IllegalArgumentException.class, () -> mayTinh.thuong(0,0));
    }

    @Test
    public void TinhThuongKhongHopLe_SoAm(){
        assertThrows(IllegalArgumentException.class, () -> mayTinh.thuong(-1,-2));
    }

    @Test
    public void TinhThuongKhongHopLe_SoLonHon100(){
        assertThrows(IllegalArgumentException.class, () -> mayTinh.thuong(101,102));
    }
}