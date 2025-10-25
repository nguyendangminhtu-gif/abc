package org.example.demosof3041.ontap2;

public class MayTinh {
    public int tong(Integer a, Integer b){
        if(a == null || b == null){
            throw new IllegalArgumentException("Vui long khong duoc de trong ");
        }
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("Vui long khong duoc nhap so am");
        }
        if(a > 100 || b > 100){
            throw new IllegalArgumentException("Vui long khong duoc nhap so lon hon 100");
        }
        int tong = a + b;
        return tong;
    }

    public int hieu(Integer a, Integer b){
        if(a == null || b == null){
            throw new IllegalArgumentException("Vui long khong duoc de trong ");
        }
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("Vui long khong duoc nhap so am");
        }
        if(a > 100 || b > 100){
            throw new IllegalArgumentException("Vui long khong duoc nhap so lon hon 100");
        }
        return a-b;
    }

    public int tich(Integer a, Integer b){
        if(a == null || b == null){
            throw new IllegalArgumentException("Vui long khong duoc de trong ");
        }
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("Vui long khong duoc nhap so am");
        }
        if(a > 100 || b > 100){
            throw new IllegalArgumentException("Vui long khong duoc nhap so lon hon 100");
        }
        return a*b;
    }

    public int thuong(Integer a, Integer b){
        if(a == null || b == null || a == 0 || b == 0){
            throw new IllegalArgumentException("Vui long khong duoc de trong ");
        }
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("Vui long khong duoc nhap so am");
        }
        if(a > 100 || b > 100){
            throw new IllegalArgumentException("Vui long khong duoc nhap so lon hon 100");
        }
        return a/b;
    }
}
