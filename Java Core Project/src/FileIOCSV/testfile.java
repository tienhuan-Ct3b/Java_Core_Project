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

//    public static void main(String[] args) {
////        FileIOHoaDon fileIOHoaDon = new FileIOHoaDon();
//        FileIOSanPham fileIOSanPham = new FileIOSanPham();
//
//        List<SanPham> listSanPhams = new ArrayList<>();
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        SanPham s1 = new SanPham("Snack banh gao cay han quoc", "Haitai - Han quoc", "banh keo", 1000, "goi", 35000, LocalDate.parse("08/02/2021", dateTimeFormatter), LocalDate.parse("08/02/2022", dateTimeFormatter));
//        SanPham s2 = new SanPham("Dau goi cafe co cay hoa la 300g", "Wellness", "dau goi", 500, "chai", 187000, LocalDate.parse("06/05/2021", dateTimeFormatter), LocalDate.parse("06/05/2023", dateTimeFormatter));
//        s1.setGiaBan();
//        s2.setGiaBan();
//        listSanPhams.add(s1);
//        listSanPhams.add(s2);
//
//        fileIOSanPham.SanPhamWriteToCSV(listSanPhams);
//        System.out.println(s1.getGiaBan());
//        System.out.println("ok");
//        List<SanPham> list = fileIOSanPham.SanPhamReadCSV();
//        System.out.println(list.get(0).getGiaBan());
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
//        FileIOHoaDon fileIOHoaDon = new FileIOHoaDon();
//        List<HoaDonBanHang> listHDBanHang = fileIOHoaDon.BanHangReadJson();
//        List<HoaDonNhapHang> listHDNhapHang = fileIOHoaDon.NhapHangReadJson();
//        int index1 = listHDBanHang.size() - 1;
//        int index2 = listHDNhapHang.size() - 1;
//        System.out.println(index1);
//        System.out.println(index2);
//    }
//    private static int check() {
//        FileIOHoaDon fileIOHoaDon = new FileIOHoaDon();
//        List<HoaDonBanHang> listHDBanHang = fileIOHoaDon.BanHangReadJson();
//        List<HoaDonNhapHang> listHDNhapHang = fileIOHoaDon.NhapHangReadJson();
//        int index1 = listHDBanHang.size() - 1;
//        int index2 = listHDNhapHang.size() - 1;
////        if (index1 != -1) {
////            int lastMaHDBH = listHDBanHang.get(index1).getMaHoaDon();
////            if (index2 != -1) {
////                int lastMaHDNH = listHDNhapHang.get(index2).getMaHoaDon();
////                if (lastMaHDBH > lastMaHDNH) {
////                    return lastMaHDBH;
////                } else {
////                    return lastMaHDNH;
////                }
////            }
////            return lastMaHDBH;
////        } else if (index2 != -1) {
////            return listHDNhapHang.get(index2).getMaHoaDon();
////        }
//        return -10000;
//    }
}
