package org.example.demosof3041.ontap3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SachServiceTest {
    SachService sachService;
    @BeforeEach
    void setUp() {
        sachService = new SachService();
    }

    @Test
    public void Tc1_HopLe(){
        Sach sach = new  Sach("S01","Sach 1","Tac gia 1",2020,30f);
        sachService.sach1.add(sach);
        assertTrue(sachService.update("S01","Sach 2","Tac gia 2",2022,20f));
    }

    @Test
    public void Tc2_BienDuoiNamXuatBan(){
        Sach sach = new  Sach("S01","Sach 1","Tac gia 1",1990,30f);
        sachService.sach1.add(sach);
        assertTrue(sachService.update("S01","Sach 2","Tac gia 2",1990,20f));
    }

    @Test
    public void Tc3_BienTrenNamXuatBan(){
        Sach sach = new  Sach("S01","Sach 1","Tac gia 1",2025,30f);
        sachService.sach1.add(sach);
        assertTrue(sachService.update("S01","Sach 2","Tac gia 2",2025,20f));
    }

    @Test
    public void Tc4_CanBienTrenNamXuatBan(){
        Sach sach = new  Sach("S01","Sach 1","Tac gia 1",2024,30f);
        sachService.sach1.add(sach);
        assertTrue(sachService.update("S01","Sach 2","Tac gia 2",2024,20f));
    }

    @Test
    public void Tc5_CanBienDuoiNamXuatBan(){
        Sach sach = new  Sach("S01","Sach 1","Tac gia 1",1991,30f);
        sachService.sach1.add(sach);
        assertTrue(sachService.update("S01","Sach 2","Tac gia 2",1991,20f));
    }

    @Test
    public void Tc6_Null(){
        Sach sach = new  Sach("S01","Sach 1","Tac gia 1",1991,30f);
        sachService.sach1.add(sach);
        assertTrue(sachService.update("","","",null,null));
    }
}