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
public class NhanVien {
    public String Ten;
    public int Tuoi;
    public String Diachi;
    public double Tienluong;
    public int Sogiolam;

    public NhanVien() {
    }

    public NhanVien(String Ten, int Tuoi, String Diachi, double Tienluong, int Sogiolam) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.Diachi = Diachi;
        this.Tienluong = Tienluong;
        this.Sogiolam = Sogiolam;
    }

    public String getTen() {
        return Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public String getDiachi() {
        return Diachi;
    }

    public double getTienluong() {
        return Tienluong;
    }

    public int getSogiolam() {
        return Sogiolam;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public void setTienluong(double Tienluong) {
        this.Tienluong = Tienluong;
    }

    public void setSogiolam(int Sogiolam) {
        this.Sogiolam = Sogiolam;
    }
    
    public String getThongTin()
    {
        return "Tên Nhân viên: "+Ten+ "\n"+
               "Tuổi: "+Tuoi+ "\n"+
                "Địa chỉ: "+Diachi+ "\n"+
                "Số giờ làm: "+Sogiolam+ "\n";
    }

    @Override
    public String toString() {
       return "Tên Nhân viên: "+Ten+ "\n"+
               "Tuổi: "+Tuoi+ "\n"+
                "Địa chỉ: "+Diachi+ "\n"+
                "Số giờ làm: "+Sogiolam+ "\n";
    } 
    public double tinhThuong()
    {
        double tienthuong=0;
        if(Sogiolam>=200)
        {
            tienthuong=Tienluong*0.2;
        }
        else if(Sogiolam<200&& Sogiolam>=100)
        {
            tienthuong=Sogiolam*0.1;
        }
        else
        {
            tienthuong=Tienluong;
        }
        
        return 0;
    }
}
