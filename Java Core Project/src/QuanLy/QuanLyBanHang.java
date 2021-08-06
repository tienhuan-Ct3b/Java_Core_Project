/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLy;

import Objects.*;
import FileIOCSV.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author admin
 */
public class QuanLyBanHang {

    FileIOSanPham fileIOSanPham = new FileIOSanPham();
    List<SanPham> listSanPhams = fileIOSanPham.SanPhamReadCSV();
    QuanLySanPham quanLySanPham = new QuanLySanPham();
    QuanLyHoaDon quanLyHoaDon = new QuanLyHoaDon();

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void BanHang(List<SanPham> list, String time, int giamGia, int thanhTien) {
        int i, j;
        for (i = 0; i < list.size(); i++) {
            SanPham s1 = list.get(i);
            for (j = 0; j < listSanPhams.size(); j++) {
                SanPham s2 = listSanPhams.get(j);
                if (s1.getMaSanPham() == s2.getMaSanPham()) {
                    quanLySanPham.SuaSoLuongSp(s1.getMaSanPham(), -s1.getSoLuong());
                }
            }
        }
        LocalDate ngayLap = LocalDate.parse(time, dateTimeFormatter);
        HoaDonBanHang hdbh = new HoaDonBanHang(ngayLap, list, giamGia, thanhTien);
        quanLyHoaDon.ThemHDBH(hdbh);
    }

    public void NhapHang(List<SanPham> list, String time, int thanhTien) {
        int i, j;
        boolean test;
        for (i = 0; i < list.size(); i++) {
            SanPham s1 = list.get(i);
            test = false;
            for (j = 0; j < listSanPhams.size(); j++) {
                SanPham s2 = listSanPhams.get(j);
                if (s2.testTrungSanPham(s1)) {
                    quanLySanPham.SuaSoLuongSp(s2.getMaSanPham(), s1.getSoLuong());
                    test = true;
                    break;
                }
            }
            if (!test) {
                SanPham s = new SanPham(s1.getTenSanPham(), s1.getNhaSX(), s1.getLoaiSanPham(), s1.getSoLuong(), s1.getDonViTinh(), s1.getGiaNhap(), s1.getNSX(), s1.getHSD());
                quanLySanPham.ThemSP(s);
            }
        }
        LocalDate ngayLap = LocalDate.parse(time, dateTimeFormatter);
        HoaDonNhapHang hdnh = new HoaDonNhapHang(ngayLap, list, list.get(0).getNhaSX(), thanhTien);
        quanLyHoaDon.ThemHDNH(hdnh);
    }
}
