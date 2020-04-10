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
public class SinhVienBiz extends SinhVienpoly{
     public double diemMarketing;
    public double diemSales;

    public SinhVienBiz(String Name, String Nganh) {
        super(Name, Nganh);
    }

    public SinhVienBiz(double diemMarketing, double diemSales, String Name, String Nganh) {
        super(Name, Nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    

    @Override
    public double getDiem() {
          return (2*diemMarketing+diemSales)/3;
    }

    @Override
    public void Xuat() {
        super.Xuat(); //To change body of generated methods, choose Tools | Templates.
         System.out.println("Điêm: "+getDiem());
        System.out.println("Học lực: "+GetHocLuc());
    }
    
}
