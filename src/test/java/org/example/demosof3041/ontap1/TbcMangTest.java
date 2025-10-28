package org.example.demosof3041.ontap1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TbcMangTest {
    public TbcMang tbcMang;

    @BeforeEach
    void setUp() {
        tbcMang = new TbcMang();
    }

    @Test
    public void tbcMangNull(){
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, () -> tbcMang.tinhTB(arr));
    }

    @Test
    public void tbcMangCo1PhanTu(){
        int[] arr = {1};
        assertEquals(1,tbcMang.tinhTB(arr));
    }

    @Test
    public void tbcMangLaSoDuong(){
        int[] arr = {1,2,3,4,5};
        assertEquals(3,tbcMang.tinhTB(arr));
    }

    @Test
    public void tbcMangLaSoAm(){
        int[] arr = {-1,-2,-3,-4,-5};
        assertEquals(-3,tbcMang.tinhTB(arr));
    }

    @Test
    public void tbcMangCoSoDuongVaSoAm(){
        int[] arr = {1,-2,3,-4,5};
        assertEquals(0,tbcMang.tinhTB(arr));
    }
}