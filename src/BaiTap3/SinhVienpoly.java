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
public abstract class SinhVienpoly {
    public String Name;
    public String Nganh; 

    public SinhVienpoly(String Name, String Nganh) {
        this.Name = Name;
        this.Nganh = Nganh;
    }
    
    

    public String getName() {
        return Name;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }
    public abstract double getDiem();
            
    public String GetHocLuc()
    {
        String Hl="";
        if(getDiem()<5)
        {
            Hl="Yếu";
        }
        else if(getDiem()<6.5)
        {
            Hl="Trung Bình";
        }
        else if(getDiem()<7.5)
        {
            Hl="Khá";
        }
        else if(getDiem()<9)
        {
            Hl="Giỏi";
        }
        else
        {
            Hl="Xuất Sắc";
        }
            
            return Hl;
    }
    public void Xuat()
    {
        System.out.println("Tên Sinh Viên: "+Name+ "\n"+
                           "Ngành: "+Nganh);
    }
}
