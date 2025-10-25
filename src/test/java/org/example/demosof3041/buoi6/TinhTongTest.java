package org.example.demosof3041.buoi6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongTest {
    TinhTong tinhTong;
    @BeforeEach
    void setUp() {
        tinhTong = new TinhTong();
    }

    @Test
    public void TinhTongHopLe(){
        int arr[]= {1,2,3,4,5};
        assertEquals(15,tinhTong.TinhTongMangSoNguyen(arr));
    }

    @Test
    public void TinhTongHopLeTaiBienTren99(){
        int arr[]= {1,2,3,4,99};
        assertEquals(109,tinhTong.TinhTongMangSoNguyen(arr));
    }

    @Test
    public void TinhTongMangNull(){
        int arr[] = {};
        assertThrows(IllegalArgumentException.class,()->tinhTong.TinhTongMangSoNguyen(arr));
    }

    @Test
    public void TinhTongMangAm(){
        int arr[] = {-1,2,3,4,5};
        assertThrows(IllegalArgumentException.class,()->tinhTong.TinhTongMangSoNguyen(arr));
    }

    @Test
    public void TinhTongMangLonHon1000(){
        int arr[] = {1001,2,3,4,5};
        assertThrows(IllegalArgumentException.class,()->tinhTong.TinhTongMangSoNguyen(arr));
    }
}