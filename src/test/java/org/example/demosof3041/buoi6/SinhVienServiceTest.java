package org.example.demosof3041.buoi6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {
    private SinhVienService sinhVienService;
    @BeforeEach
    void setUp() {
        sinhVienService = new SinhVienService();
    }

    //--------------2 cau check null
    @Test
    public void CheckSinhVienNull(){
        SinhVien sinhVien = null;
        assertThrows(IllegalArgumentException.class, () -> sinhVienService.Sua(sinhVien));
    }

    @Test
    public void CheckThongTinSinhVienTrong(){
        SinhVien sinhVien = new  SinhVien("", "", null, null, null, "");
        assertThrows(IllegalArgumentException.class, () -> sinhVienService.Sua(sinhVien));
    }


    @Test
    public void SuaSinhVienDiemNgoaiKhoangHopLe_01(){
        SinhVien sinhVien = new  SinhVien("SV01", "Nguyen Van C", 28, -5f, 6, "CNTT");
        assertThrows(IllegalArgumentException.class, () -> sinhVienService.Sua(sinhVien));
    }

    @Test
    public void SuaSinhVienDiemNgoaiKhoangHopLe_02(){
        SinhVien sinhVien = new  SinhVien("SV01", "Nguyen Van C", 28, 15f, 6, "CNTT");
        assertThrows(IllegalArgumentException.class, () -> sinhVienService.Sua(sinhVien));
    }


}