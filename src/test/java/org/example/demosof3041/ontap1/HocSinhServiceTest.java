package org.example.demosof3041.ontap1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HocSinhServiceTest {
    private  HocSinhService hocSinhService;

    @BeforeEach
    void setUp(){
        hocSinhService = new HocSinhService();
    }

    @Test
    public void themHocSinhHopLe(){
        HocSinh hs = new HocSinh(1,"Nguyen Van A",15,8.5f);
        assertTrue(hocSinhService.themHocSinh(hs));
    }

    @Test
    public void themHocSinhVoiTuoiLaAm(){
        HocSinh hs = new HocSinh(1,"Nguyen Van A",-15,8.5f);
        assertThrows(IllegalArgumentException.class, () -> hocSinhService.themHocSinh(hs));
    }

    @Test
    public void themHocSinhVoiDiemLonHon10(){
        HocSinh hs = new HocSinh(3,"Nguyen Van A",15,20f);
        assertThrows(IllegalArgumentException.class, () -> hocSinhService.themHocSinh(hs));
    }

    @Test
    public void themHocSinhVoiTenTrong(){
        HocSinh hs = new HocSinh(2,"",15,8.5f);
        assertThrows(IllegalArgumentException.class, () -> hocSinhService.themHocSinh(hs));
    }

    @Test
    public void themHocSinhVoiTrungID(){
        HocSinh hs = new HocSinh(1,"Nguyen Van A",15,8.5f);
        HocSinh hs2 = new HocSinh(1,"Nguyen Van A",15,8.5f);
        hocSinhService.themHocSinh(hs2);
        assertThrows(IllegalArgumentException.class, () -> hocSinhService.themHocSinh(hs));
    }

    @Test
    public void suaHocSinhHopLe(){
        HocSinh hs = new HocSinh(1,"Nguyen Van A",15,8.5f);
        hocSinhService.themHocSinh(hs);
        assertTrue(hocSinhService.suaHocSinh(1,"Nguyen Van B", 18, 9f));
    }

    @Test
    public void suaHocSinhKhongHopLe(){
        HocSinh hs = new HocSinh(1,"Nguyen Van A",15,8.5f);
        hocSinhService.themHocSinh(hs);
        assertThrows(IllegalArgumentException.class,() -> hocSinhService.suaHocSinh(1,"Nguyen Van B", 118, 9f));
    }

    @Test
    public void suaHocSinhVoiDiemAm(){
        HocSinh hs = new HocSinh(1,"Nguyen Van A",15,8.5f);
        hocSinhService.themHocSinh(hs);
        assertThrows(IllegalArgumentException.class,() -> hocSinhService.suaHocSinh(1,"Nguyen Van B", -18, 9f));
    }

    @Test
    public void suaHocSinhVoiTuoiLonHon18(){
        HocSinh hs = new HocSinh(1,"Nguyen Van A",15,8.5f);
        hocSinhService.themHocSinh(hs);
        assertThrows(IllegalArgumentException.class,() -> hocSinhService.suaHocSinh(1,"Nguyen Van B", 58, 9f));
    }

    @Test
    public void suaHocSinhVoiTenTrong(){
        HocSinh hs = new HocSinh(1,"Nguyen Van A",15,8.5f);
        hocSinhService.themHocSinh(hs);
        assertThrows(IllegalArgumentException.class,() -> hocSinhService.suaHocSinh(1,"", -18, 9f));
    }

}