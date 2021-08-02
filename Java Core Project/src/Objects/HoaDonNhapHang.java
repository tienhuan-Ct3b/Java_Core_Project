/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import com.opencsv.bean.CsvBindByPosition;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonNhapHang extends HoaDon {

    @CsvBindByPosition(position = 3)
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
}
