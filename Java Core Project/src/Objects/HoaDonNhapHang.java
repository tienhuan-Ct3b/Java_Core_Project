/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.time.LocalDate;
import java.util.List;


/**
 *
 * @author Admin
 */

public class HoaDonNhapHang extends HoaDon {

    @SerializedName("nhaSanXuat")
    @Expose
    private String nhaSanXuat;

    public HoaDonNhapHang() {
    }

    public HoaDonNhapHang(LocalDate ngayLap, List<Objects.SanPham> SanPham, String nhaSanXuat, long thanhTien) {
        super(ngayLap, SanPham, thanhTien);
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
        return "HoaDonNhapHang{" + "maHoaDon=" + super.getMaHoaDon() + ", ngayLap=" + super.getNgayLap() + "nhaSanXuat=" + nhaSanXuat + ", SanPhams=" + super.getSanPham() + ", thanhTien=" + super.getThanhTien() + '}';
    }

}
