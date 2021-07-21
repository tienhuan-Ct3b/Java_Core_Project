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
public class Hoa_Don {
    private String maHoaDon;
    private LocalDate ngayLap;
    private String maHang;
    private int soLuong;
    private int gia;
    private long thanhTien;

    public Hoa_Don() {
    }

    public Hoa_Don(String maHoaDon, LocalDate ngayLap, String maHang, int soLuong, int gia, long thanhTien) {
        this.maHoaDon = maHoaDon;
        this.ngayLap = ngayLap;
        this.maHang = maHang;
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

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
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
        return "Hoa_Don{" + "maHoaDon=" + maHoaDon + ", ngayLap=" + ngayLap + ", maHang=" + maHang + ", soLuong=" + soLuong + ", gia=" + gia + ", thanhTien=" + thanhTien ;
    }

    
}
