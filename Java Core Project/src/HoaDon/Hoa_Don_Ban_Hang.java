/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HoaDon;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class Hoa_Don_Ban_Hang extends Hoa_Don{
    private int giamGia;

    public Hoa_Don_Ban_Hang() {
    }

    public Hoa_Don_Ban_Hang(int giamGia) {
        this.giamGia = giamGia;
    }

    public Hoa_Don_Ban_Hang(int giamGia, String maHoaDon, LocalDate ngayLap, String maHang, int soLuong, int gia, long thanhTien) {
        super(maHoaDon, ngayLap, maHang, soLuong, gia, thanhTien);
        this.giamGia = giamGia;
    }

    public int getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }

   @Override
    public String toString() {
        return super.toString() + ", giamGia=" + giamGia + '}'; //To change body of generated methods, choose Tools | Templates.
    } 
    
}
