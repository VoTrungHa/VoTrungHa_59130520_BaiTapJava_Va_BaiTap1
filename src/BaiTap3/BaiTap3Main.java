/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author DT
 */
public class BaiTap3Main {
  
    public static void main(String[] args) {
        SinhVienIt it=new SinhVienIt(8, 8, 7, "Võ Trung Hà", "IT"); 
        SinhVienpoly poly=new SinhVienIt(8, 8, 7, "Trần phứơc Thắng", "IT"); 
        SinhVienBiz biz=new SinhVienBiz(9, 3, "Trần thanh thảo", "Quảng cáo");
        it.Xuat();
        biz.Xuat();
        poly.Xuat();
    
}

}
