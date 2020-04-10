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
public class SinhVienIt extends SinhVienpoly{
    
    public double diemjava;
    public double diemcss;
    public double diemhtml;

    public SinhVienIt(String Name, String Nganh) {
        super(Name, Nganh);
    } 
    public SinhVienIt(double diemjava, double diemcss, double diemhtml, String Name, String Nganh) {
        super(Name, Nganh);
        this.diemjava = diemjava;
        this.diemcss = diemcss;
        this.diemhtml = diemhtml;
    } 
     
    @Override
    public double getDiem() {
        return (2*diemjava+diemcss+diemhtml)/4;
    }

    @Override
    public void Xuat() {
        super.Xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Điêm: "+getDiem());
        System.out.println("Học lực: "+GetHocLuc());
    }
}
