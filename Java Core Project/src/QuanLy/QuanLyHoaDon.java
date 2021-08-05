/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLy;

import FileIOCSV.FileIOHoaDon;
import Objects.*;
import java.util.List;

public class QuanLyHoaDon {

    FileIOHoaDon fileIOHoaDon = new FileIOHoaDon();
    List<HoaDonBanHang> listHDBanHang = fileIOHoaDon.BanHangReadJson();
    List<HoaDonNhapHang> listHDNhapHang = fileIOHoaDon.NhapHangReadJson();

    private int check() {
        int lastMaHDBH = listHDBanHang.get(listHDBanHang.size() - 1).getMaHoaDon();
        int lastMaHDNH = listHDNhapHang.get(listHDNhapHang.size() - 1).getMaHoaDon();
        if (lastMaHDBH > lastMaHDNH) {
            return lastMaHDBH;
        }
        return lastMaHDNH;
    }

    public void ThemHDBH(HoaDonBanHang hdbh) {
        int temp = check();
        if (temp != -1) {
            HoaDon.setMaHoaDonLast(temp);
        }
        listHDBanHang.add(hdbh);
        fileIOHoaDon.BanHangWriteToJson(listHDBanHang);
    }

    public void ThemHDNH(HoaDonNhapHang hdnh) {
        int temp = check();
        if (temp != -1) {
            HoaDon.setMaHoaDonLast(temp);
        }
        listHDNhapHang.add(hdnh);
        fileIOHoaDon.NhapHangWriteToJson(listHDNhapHang);
    }
}
