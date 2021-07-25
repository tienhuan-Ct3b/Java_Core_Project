/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class HoaDonBanHang extends HoaDon{
    private int giamGia;

    public HoaDonBanHang() {
    }

    public HoaDonBanHang(int giamGia) {
        this.giamGia = giamGia;
    }

    public HoaDonBanHang(int giamGia, String maHoaDon, LocalDate ngayLap, String maSanPham, int soLuong, int gia, long thanhTien) {
        super(maHoaDon, ngayLap, maSanPham, soLuong, gia, thanhTien);
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
