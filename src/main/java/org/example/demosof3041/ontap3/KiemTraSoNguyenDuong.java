package org.example.demosof3041.ontap3;

public class KiemTraSoNguyenDuong {
    public Integer checkSoNguyenDuong(Integer num){
        if(num==null||num==0){
            throw new IllegalArgumentException("Vui long so khong duoc de trong");
        }
        if(num<0||num>100){
            throw new IllegalArgumentException("Vui long so khong duoc <0 va >100");
        }
        return num;
    }
}
