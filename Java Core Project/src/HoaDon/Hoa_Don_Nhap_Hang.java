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
public class Hoa_Don_Nhap_Hang extends Hoa_Don{
    private String nhaSanXuat;

    public Hoa_Don_Nhap_Hang() {
    }

    public Hoa_Don_Nhap_Hang(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public Hoa_Don_Nhap_Hang(String nhaSanXuat, String maHoaDon, LocalDate ngayLap, String maHang, int soLuong, int gia, long thanhTien) {
        super(maHoaDon, ngayLap, maHang, soLuong, gia, thanhTien);
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hoa_Don_Nhap_Hang{nhaSanXuat=").append(nhaSanXuat);
        sb.append('}');
        return sb.toString();
    }
    
}
