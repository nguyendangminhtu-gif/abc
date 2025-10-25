package org.example.demosof3041.ontap2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruongHocServiceTest {
    TruongHocService truongHocService;
    @BeforeEach
    void setUp(){
        truongHocService = new TruongHocService();
    }

    @Test
    public void themTruongHocHopLe(){
        TruongHoc truongHoc = new TruongHoc("TH01","Truong Hoc 1","abc",100);
        assertTrue(truongHocService.themTruongHoc(truongHoc));
    }

    @Test
    public  void themTruongHocKhongHopLe_TenNull(){
        TruongHoc truongHoc = new TruongHoc("TH01","","abc",100);
        assertThrows(IllegalArgumentException.class, () -> truongHocService.themTruongHoc(truongHoc));
    }

    @Test
    public  void themTruongHocKhongHopLe_DiaChiNull(){
        TruongHoc truongHoc = new TruongHoc("TH01","Truong hoc 1","",100);
        assertThrows(IllegalArgumentException.class, () -> truongHocService.themTruongHoc(truongHoc));
    }

    @Test
    public  void themTruongHocKhongHopLe_SoLuongHSNull(){
        TruongHoc truongHoc = new TruongHoc("TH01","Truong hoc 1","abc",null);
        assertThrows(IllegalArgumentException.class, () -> truongHocService.themTruongHoc(truongHoc));
    }

    @Test
    public  void themTruongHocKhongHopLe_SoLuongHSBeHon0(){
        TruongHoc truongHoc = new TruongHoc("TH01","Truong hoc 1","abc",-1);
        assertThrows(IllegalArgumentException.class, () -> truongHocService.themTruongHoc(truongHoc));
    }

    @Test
    public  void themTruongHocKhongHopLe_SoLuongHSLonHon1000(){
        TruongHoc truongHoc = new TruongHoc("TH01","Truong hoc 1","abc",1001);
        assertThrows(IllegalArgumentException.class, () -> truongHocService.themTruongHoc(truongHoc));
    }

    @Test
    public void suaTruongHocHopLe(){
        TruongHoc truongHoc = new TruongHoc("TH01","Truong Hoc 1","abc",100);
        truongHocService.themTruongHoc(truongHoc);
        assertTrue(truongHocService.suaTruongHoc("TH01","Truong Hoc 2","abcd",200));
    }

    @Test
    public void suaTruongHocKhongHopLe_TenNull(){
        TruongHoc truongHoc = new TruongHoc("TH01","Truong Hoc 1","abc",100);
        truongHocService.themTruongHoc(truongHoc);
        assertThrows(IllegalArgumentException.class, () -> truongHocService.suaTruongHoc("TH01","","abcd",200));
    }

    @Test
    public void suaTruongHocKhongHopLe_DiaChiNull(){
        TruongHoc truongHoc = new TruongHoc("TH01","Truong Hoc 1","abc",100);
        truongHocService.themTruongHoc(truongHoc);
        assertThrows(IllegalArgumentException.class, () -> truongHocService.suaTruongHoc("TH01","Truong hoc 2","",200));
    }

    @Test
    public void suaTruongHocKhongHopLe_SoLuongHSNull(){
        TruongHoc truongHoc = new TruongHoc("TH01","Truong Hoc 1","abc",100);
//        truongHocService.themTruongHoc(truongHoc);
        assertThrows(IllegalArgumentException.class, () -> truongHocService.suaTruongHoc("TH01","Truong Hoc 2","abcd",null));
    }
}