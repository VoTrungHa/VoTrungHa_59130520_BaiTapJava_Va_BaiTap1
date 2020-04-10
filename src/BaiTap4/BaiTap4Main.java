/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author DT
 */
public class BaiTap4Main {
    public static void main(String[] args) {
        ChuyenXe nt=new NoiThanh(1, 12, "NT001", "Võ Trung Hà", "SX002", 3000);
         ChuyenXe nt1=new NoiThanh(2, 12, "NT001", "Thanh lam", "SX002", 4000);
          ChuyenXe nt2=new NoiThanh(3, 12, "NT001", "Văn Tú", "SX002", 6000);
        ChuyenXe ngt=new NgoaiThanh("Sài Gòn", 23, "NGT002", "Hải Đăng", "SX562", 20000);
         ChuyenXe ng2=new NgoaiThanh("Sài Gòn", 17, "NGT002", "Trân phi", "SX562", 50000);
        ChuyenXe ngt1=new NgoaiThanh("Sài Gòn", 12, "NGT002", "Văn Hải", "SX562", 40000);
        QuanLyChuyenXe ql=new QuanLyChuyenXe();
        ql.themChuyenXe(nt);
         ql.themChuyenXe(nt1);
        ql.themChuyenXe(ngt);
        ql.themChuyenXe(ngt1);
        
        System.out.println("================== Thông Tin Từng Chuyến Xe ==================");
        ql.TTChuyenXe();
         System.out.println("============== Tổng doanh thu của xe ngoại thành ==============");
        System.out.println("Tổng Doanh Thu: "+ql.TongDoangThuNgoaiThanh());
        System.out.println("============== Tổng doanh thu của xe Nội thành ==============");
        System.out.println("Tổng Doanh Thu: "+ql.TongDoangThuNoiThanh());
         System.out.println("============== Tổng doanh thu Cuả Hai Loại ==============");
        System.out.println("Tổng Doanh Thu: "+ql.TongDoangThuHaiLoai());
        
    }
}
