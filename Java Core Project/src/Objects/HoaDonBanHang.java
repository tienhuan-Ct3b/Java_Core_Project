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
public class HoaDonBanHang extends HoaDon {
    
    @CsvBindByPosition(position = 3)
    private int giamGia;

    public HoaDonBanHang() {
    }

    public HoaDonBanHang(LocalDate ngayLap, List<Objects.SanPham> SanPham, int giamGia, long thanhTien) {
        super(ngayLap, SanPham, thanhTien);
        this.giamGia = giamGia;
    }

    public int getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }
}
