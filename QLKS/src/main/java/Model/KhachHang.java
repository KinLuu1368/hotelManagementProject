/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Kien Luu
 */
public class KhachHang {
    int SDT;
    String hoTen;
    int soCMND;
    String maDat;
    
    public KhachHang() {}
    
    public KhachHang(int SDT, String hoTen, int soCMND, String maDat) {
        this.SDT = SDT;
        this.hoTen = hoTen;
        this.soCMND = soCMND;
        this.maDat = maDat;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    public String getMaDat() {
        return maDat;
    }

    public void setMaDat(String maDat) {
        this.maDat = maDat;
    }
    
    
}
