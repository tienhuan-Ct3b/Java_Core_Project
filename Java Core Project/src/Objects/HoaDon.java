/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.time.LocalDate;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Admin
 */
public class HoaDon {

    private static int maHoaDonLast = 100000;
    @SerializedName("maHoaDon")
    @Expose
    private int maHoaDon;
    @SerializedName("ngayLap")
    @Expose
    private LocalDate ngayLap;
    @SerializedName("SanPhams")
    @Expose
    private List<SanPham> SanPhams;
    @SerializedName("thanhTien")
    @Expose
    private long thanhTien;

    public HoaDon() {
        this.maHoaDon = ++maHoaDonLast;
    }

    public HoaDon(LocalDate ngayLap, List<SanPham> SanPhams, long thanhTien) {
        this.maHoaDon = ++maHoaDonLast;
        this.ngayLap = ngayLap;
        this.SanPhams = SanPhams;
        this.thanhTien = thanhTien;
    }

    public static void setMaHoaDonLast(int maHoaDonLast) {
        HoaDon.maHoaDonLast = maHoaDonLast;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public LocalDate getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(LocalDate ngayLap) {
        this.ngayLap = ngayLap;
    }

    public List<SanPham> getSanPham() {
        return SanPhams;
    }

    public void setSanPham(List<SanPham> SanPhams) {
        this.SanPhams = SanPhams;
    }

    public long getThanhTien() {
        return thanhTien;
    }

    public boolean testTrungMaHD(HoaDon hd) {
        if (hd.getMaHoaDon() == this.getMaHoaDon()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHoaDon=" + maHoaDon + ", ngayLap=" + ngayLap + ", SanPhams=" + SanPhams + ", thanhTien=" + thanhTien + '}';
    }

}
