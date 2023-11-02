/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Kien Luu
 */
public class HoaDon {
    String maHD;
    int SDTKhach;
    String soPhong;
    
    public HoaDon() {}
    
    public HoaDon(String maHD, int SDTKhach, String soPhong) {
        this.maHD = maHD;
        this.SDTKhach = SDTKhach;
        this.soPhong = soPhong;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public int getSDTKhach() {
        return SDTKhach;
    }

    public void setSDTKhach(int SDTKhach) {
        this.SDTKhach = SDTKhach;
    }

    public String getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }
    
    
}
