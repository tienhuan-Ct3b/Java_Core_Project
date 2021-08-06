/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIOCSV;

import Objects.HoaDon;
import Objects.HoaDonBanHang;
import Objects.HoaDonNhapHang;
import Objects.SanPham;
import QuanLy.QuanLyBanHang;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class testfile {

    public static void main(String[] args) {
//        FileIOHoaDon fileIOHoaDon = new FileIOHoaDon();
//        FileIOSanPham fileIOSanPham = new FileIOSanPham();
//
//        List<HoaDonNhapHang> listHoaDonNhapHangs = fileIOHoaDon.NhapHangReadJson();
//        List<HoaDonBanHang> listHoaDonBanHangs = new FileIOHoaDon().BanHangReadJson();
////        QuanLyBanHang quanLyBanHang = new QuanLyBanHang();
//        listHoaDonBanHangs.remove(0);
//        listHoaDonNhapHangs.remove(0);
//        String s = "05/08/2021";
//        LocalDate time = LocalDate.parse(s, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//
//        List<SanPham> listSanPham = fileIOSanPham.SanPhamReadCSV();
//        List<SanPham> listSanPhamBan = new ArrayList<>();
//        List<SanPham> listSanPhamNhap = new ArrayList<>();
//
//        SanPham ban = listSanPham.get(0);
//        SanPham nhap = listSanPham.get(1);
//        
//        listSanPhamBan.add(ban);
//        listSanPhamNhap.add(nhap);
//
//        HoaDonBanHang hdbH = new HoaDonBanHang(time, listSanPhamBan, 0, 100000);
//        HoaDonNhapHang hdnH = new HoaDonNhapHang(time, listSanPhamNhap, "Wellness", 100000);
//
//        listHoaDonBanHangs.add(hdbH);
//        listHoaDonNhapHangs.add(hdnH);
//
//        fileIOHoaDon.BanHangWriteToJson(listHoaDonBanHangs);
//        fileIOHoaDon.NhapHangWriteToJson(listHoaDonNhapHangs);
//        System.out.println("ok");
        FileIOHoaDon fileIOHoaDon = new FileIOHoaDon();
        List<HoaDonBanHang> listHDBanHang = fileIOHoaDon.BanHangReadJson();
        List<HoaDonNhapHang> listHDNhapHang = fileIOHoaDon.NhapHangReadJson();
        int index1 = listHDBanHang.size() - 1;
        int index2 = listHDNhapHang.size() - 1;
        System.out.println(index1);
        System.out.println(index2);
        
    }

    private static int check() {
        FileIOHoaDon fileIOHoaDon = new FileIOHoaDon();
        List<HoaDonBanHang> listHDBanHang = fileIOHoaDon.BanHangReadJson();
        List<HoaDonNhapHang> listHDNhapHang = fileIOHoaDon.NhapHangReadJson();
        int index1 = listHDBanHang.size() - 1;
        int index2 = listHDNhapHang.size() - 1;
//        if (index1 != -1) {
//            int lastMaHDBH = listHDBanHang.get(index1).getMaHoaDon();
//            if (index2 != -1) {
//                int lastMaHDNH = listHDNhapHang.get(index2).getMaHoaDon();
//                if (lastMaHDBH > lastMaHDNH) {
//                    return lastMaHDBH;
//                } else {
//                    return lastMaHDNH;
//                }
//            }
//            return lastMaHDBH;
//        } else if (index2 != -1) {
//            return listHDNhapHang.get(index2).getMaHoaDon();
//        }
        return -10000;
    }
}
