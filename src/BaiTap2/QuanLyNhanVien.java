/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2; 
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DT
 */
public class QuanLyNhanVien implements IQuanLy{
     ArrayList<NhanVien> ds = new ArrayList<NhanVien>(); 
    @Override
    public void Them(NhanVien nv) { 
       ds.add(nv); 
    } 
    @Override
    public void inDS() {
        Iterator itr = ds.iterator();
        while (itr.hasNext()) {
            Object element = itr.next(); 
            System.out.println(element);
        }
    }
}
