package org.example.demosof3041.ontap1;

public class TbcMang {
    public int tinhTB(int[] arr){
        if(arr == null ||  arr.length == 0){
            throw new IllegalArgumentException("Mảng rỗng hoặc null");
        }
        int tong = 0;
        for(int value : arr){
            tong += value;
        }
        return tong / arr.length;
    }
}
