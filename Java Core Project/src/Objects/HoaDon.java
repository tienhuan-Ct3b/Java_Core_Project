/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDon {

    private static int maHoaDonLast = 100000;
    @CsvBindByPosition(position = 0)
    private int maHoaDon;
    @CsvDate(value = "yyyy-MM-dd")
    @CsvBindByPosition(position = 1)
    private LocalDate ngayLap;
    @CsvBindByPosition(position = 2)
    private List<SanPham> SanPham;
    @CsvBindByPosition(position = 4)
    private long thanhTien;

    public HoaDon() {
        this.maHoaDon = ++maHoaDonLast;
    }

    public HoaDon(LocalDate ngayLap, List<SanPham> SanPham, long thanhTien) {
        this.maHoaDon = ++maHoaDonLast;
        this.ngayLap = ngayLap;
        this.SanPham = SanPham;
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
        return SanPham;
    }

    public void setSanPham(List<SanPham> SanPham) {
        this.SanPham = SanPham;
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
}
