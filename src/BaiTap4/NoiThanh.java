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
public class NoiThanh extends ChuyenXe{
    public int SoTuyen;
    public double SoKmDD;

    public NoiThanh() {
    }

    public NoiThanh(int SoTuyen, double SoKmDD, String MaSoChuyen, String HoTenTaiXe, String SoXe, double DoanhThu) {
        super(MaSoChuyen, HoTenTaiXe, SoXe, DoanhThu);
        this.SoTuyen = SoTuyen;
        this.SoKmDD = SoKmDD;
    }

    
    
    @Override
    public String toString() {
        return super.toString()+"Số Tuyến: "+SoTuyen+"\n"+"Số KMĐĐ: "+SoKmDD;
    }
   
}
