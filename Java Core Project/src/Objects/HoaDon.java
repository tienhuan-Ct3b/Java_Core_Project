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
public class HoaDon {
    private String maHoaDon;
    private LocalDate ngayLap;
    private String maSanPham;
    private int soLuong;
    private int gia;
    private long thanhTien;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, LocalDate ngayLap, String maSanPham, int soLuong, int gia, long thanhTien) {
        this.maHoaDon = maHoaDon;
        this.ngayLap = ngayLap;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.gia = gia;
        this.thanhTien = thanhTien;
    }

    public long getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(long thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public LocalDate getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(LocalDate ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHoaDon=" + maHoaDon + ", ngayLap=" + ngayLap + ", maSanPham=" + maSanPham + ", soLuong=" + soLuong + ", gia=" + gia + ", thanhTien=" + thanhTien ;
    }

    
}
