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
public class ChuyenXe {
    public String MaSoChuyen;
    public String HoTenTaiXe;
    public String SoXe;
    public double DoanhThu; 
    public ChuyenXe() {
    }

    public ChuyenXe(String MaSoChuyen, String HoTenTaiXe, String SoXe, double DoanhThu) {
        this.MaSoChuyen = MaSoChuyen;
        this.HoTenTaiXe = HoTenTaiXe;
        this.SoXe = SoXe;
        this.DoanhThu = DoanhThu;
    }

    public String getMaSoChuyen() {
        return MaSoChuyen;
    }

    public String getHoTenTaiXe() {
        return HoTenTaiXe;
    }

    public String getSoXe() {
        return SoXe;
    }

    public double getDoanhThu() {
        return DoanhThu;
    }

    public void setMaSoChuyen(String MaSoChuyen) {
        this.MaSoChuyen = MaSoChuyen;
    }

    public void setHoTenTaiXe(String HoTenTaiXe) {
        this.HoTenTaiXe = HoTenTaiXe;
    }

    public void setSoXe(String SoXe) {
        this.SoXe = SoXe;
    }

    public void setDoanhThu(double DoanhThu) {
        this.DoanhThu = DoanhThu;
    }

    @Override
    public String toString() {
        return "Tên tài xế: " + HoTenTaiXe + "\n"
                + "Số Xe: " + SoXe + "\n"
                + "Doanh thu: " + DoanhThu + "\n"
                + "Mã Số Chuyến: " + MaSoChuyen + "\n";
    }

}
