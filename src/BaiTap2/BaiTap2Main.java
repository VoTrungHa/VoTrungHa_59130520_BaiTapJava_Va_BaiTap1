/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author DT
 */
public class BaiTap2Main {
    
    public static void main(String[] args) {
         NhanVien nv=new NhanVien("tran Bich Thoa", 24,"Tran Phu",2000,154);
         NhanVien nv1=new NhanVien("Trần Thị Lài", 30,"Nha Trang",2000,300); 
          NhanVien nv2=new NhanVien("Nguyễn Văn Tài", 24,"Tran Phu",2000,150);
         NhanVien nv3=new NhanVien("Trần Kim Thoa", 30,"Nha Trang",2000,90); 
         NhanVien nv4=new NhanVien("Võ Văn Phát", 30,"Nha Trang",2000,75); 
         QuanLyNhanVien ql=new QuanLyNhanVien(); 
          ql.Them(nv);
          ql.Them(nv1);
          ql.Them(nv2);
          ql.Them(nv3);
          ql.Them(nv4); 
          ql.inDS();
    }
}
