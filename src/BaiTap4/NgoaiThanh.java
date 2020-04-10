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
public class NgoaiThanh extends ChuyenXe{
    public String NoiDen;
    public int SoNgayDi; 

    public NgoaiThanh() {
    }

    public NgoaiThanh(String NoiDen, int SoNgayDi, String MaSoChuyen, String HoTenTaiXe, String SoXe, double DoanhThu) {
        super(MaSoChuyen, HoTenTaiXe, SoXe, DoanhThu);
        this.NoiDen = NoiDen;
        this.SoNgayDi = SoNgayDi;
    }
 

    @Override
    public String toString() {
        return super.toString()+"Nơi Đến:" +NoiDen+"\n"+"Số Ngày Đi: "+SoNgayDi; 
                           
    }
}
