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
public class HoaDonNhapHang extends HoaDon{
    private String nhaSanXuat;

    public HoaDonNhapHang() {
    }

    public HoaDonNhapHang(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public HoaDonNhapHang(String nhaSanXuat, String maHoaDon, LocalDate ngayLap, String maSanPham, int soLuong, int gia, long thanhTien) {
        super(maHoaDon, ngayLap, maSanPham, soLuong, gia, thanhTien);
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
