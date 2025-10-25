package org.example.demosof3041.buoi2;

public class StudentGrader {
    public String xepLoai(int diem) {
        if (diem >= 0 && diem <= 40) {
            return "F";
        } else if (diem >= 41 && diem <= 60) {
            return "D";
        } else if (diem >= 61 && diem <= 70) {
            return "C";
        } else if (diem >= 71 && diem <= 80) {
            return "B";
        } else if (diem >= 81 && diem <= 100) {
            return "A";
        }else{
            throw new IllegalArgumentException("Điểm không hợp lệ");
        }
    }
}
