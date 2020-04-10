/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DT
 */
public class QuanLyChuyenXe  {
    NoiThanh nt;
    NgoaiThanh ngt;
    ArrayList<ChuyenXe> ds = new ArrayList();

    public void themChuyenXe(ChuyenXe cx) {
        ds.add(cx);
    }

    public void TTChuyenXe() {
        Iterator itr = ds.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println("============ Chuyến Xe ============");
            System.out.println(element);
        }
    }

    public double TongDoangThuNgoaiThanh() {
        double tong = 0; 
        Iterator itr = ds.listIterator();
        while (itr.hasNext()) {
            Object  element = itr.next();
             if(element instanceof NgoaiThanh)
             {
                 tong+=((NgoaiThanh) element).getDoanhThu(); 
             } 
        } 
        return tong;

    }
    public double TongDoangThuNoiThanh() {
        double tong = 0; 
        Iterator itr = ds.listIterator();
        while (itr.hasNext()) {
            Object  element = itr.next();
             if(element instanceof NoiThanh)
             {
                 tong+=((NoiThanh) element).getDoanhThu();
                         
             } 
        } 
        return tong;

    }
     public double TongDoangThuHaiLoai() {
        double tong = 0; 
          for (int i = 0; i < ds.size(); i++) {
             tong+=ds.get(i).DoanhThu; 
         }
        return tong;

    }

    
     
    
}
