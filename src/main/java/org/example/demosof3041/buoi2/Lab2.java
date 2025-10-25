package org.example.demosof3041.buoi2;

public class Lab2 {
    public int tong(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Số không được nhỏ hơn 0");
        } else if (a > 100 || b > 100) {
            throw new IllegalArgumentException("Số không được lớn hơn 100");
        } else {
            return a + b;
        }
    }
    public int chia(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Số không được nhỏ hơn 0");
        } else if (a > 100 || b > 100) {
            throw new IllegalArgumentException("Số không được lớn hơn 100");
        } else if (b == 0) {
            throw new IllegalArgumentException("Không được chia cho 0");
        }
        return a / b;
    }
}
