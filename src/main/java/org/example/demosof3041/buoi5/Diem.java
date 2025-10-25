package org.example.demosof3041.buoi5;

public class Diem {
    public double tinhTB(Double toan, Double ly, Double hoa) {
        if (toan == null && ly == null && hoa == null) {
            throw new ArithmeticException("Lỗi chia cho 0 - không có môn nào hợp lệ!");
        }

        double tong = 0;
        int dem = 0;

        if (toan != null) {
            if (toan < 0 || toan > 10) {
                throw new IllegalArgumentException("Điểm Toán không hợp lệ!");
            }
            tong += toan;
            dem++;
        }

        if (ly != null) {
            if (ly < 0 || ly > 10) {
                throw new IllegalArgumentException("Điểm Lý không hợp lệ!");
            }
            tong += ly;
            dem++;
        }

        if (hoa != null) {
            if (hoa < 0 || hoa > 10) {
                throw new IllegalArgumentException("Điểm Hóa không hợp lệ!");
            }
            tong += hoa;
            dem++;
        }

        if (dem == 0) {
            throw new ArithmeticException("Lỗi chia cho 0 - không có môn hợp lệ!");
        }

        return tong / dem;
    }
}
