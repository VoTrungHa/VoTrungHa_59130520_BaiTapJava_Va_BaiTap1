/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;
 
/**
 *
 * @author DT
 */
public class baiTap1Main {
    
    public static void main(String[] args) {
         NhanVien nv=new NhanVien("tran Bich Thoa", 24,"Tran Phu",2000,154);
         NhanVien nv1=new NhanVien("Trần Thị Lài", 30,"Nha Trang",2000,300); 
          nv.getThongTin();
          System.out.println(nv.getThongTin());
    }
}
