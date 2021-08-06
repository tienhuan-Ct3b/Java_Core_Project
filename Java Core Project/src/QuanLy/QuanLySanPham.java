/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLy;

import Objects.SanPham;
import FileIOCSV.FileIOSanPham;
import java.util.List;

public class QuanLySanPham {

    FileIOSanPham fileIOSanPham = new FileIOSanPham();
    List<SanPham> listSanPham = fileIOSanPham.SanPhamReadCSV();

    public void ThemSP(SanPham s) {
        int temp = listSanPham.size() - 1;
        if (temp != -1) {
            SanPham.setMaSanPhamLast(listSanPham.get(temp).getMaSanPham());
        }
        s.setGiaBan();
        listSanPham.add(s);
        fileIOSanPham.SanPhamWriteToCSV(listSanPham);
    }

    public void ThemSp(List<SanPham> list) {
        list.forEach(s -> {
            ThemSP(s);
        });
    }

    //maSP là mã của sản phẩm cần sửa, sản phẩm 2 là sản phẩm sau khi đã sửa.
    public void SuaSP(int maSP, SanPham s2) {
        int i;
        for (i = 0; i < listSanPham.size(); i++) {
            if (listSanPham.get(i).getMaSanPham() == maSP) {
                listSanPham.get(i).setTenSanPham(s2.getTenSanPham());
                listSanPham.get(i).setNhaSX(s2.getNhaSX());
                listSanPham.get(i).setLoaiSanPham(s2.getLoaiSanPham());
                listSanPham.get(i).setSoLuong(s2.getSoLuong());
                listSanPham.get(i).setDonViTinh(s2.getDonViTinh());
                listSanPham.get(i).setGiaNhap(s2.getGiaNhap());
                listSanPham.get(i).setGiaBan();
                listSanPham.get(i).setNSX(s2.getNSX());
                listSanPham.get(i).setHSD(s2.getHSD());
                fileIOSanPham.SanPhamWriteToCSV(listSanPham);
                break;
            }
        }
    }

    public void SuaSoLuongSp(int MaSanPham, int soLuong) {
        int i;
        for (i = 0; i < listSanPham.size(); i++) {
            if (listSanPham.get(i).getMaSanPham() == MaSanPham) {
                listSanPham.get(i).setSoLuong(listSanPham.get(i).getSoLuong() + soLuong);
            }
        }
        fileIOSanPham.SanPhamWriteToCSV(listSanPham);
    }

    public void xoaSP(int maSanPham) {
        int i;
        for (i = 0; i < listSanPham.size(); i++) {
            if (listSanPham.get(i).getMaSanPham() == maSanPham) {
                listSanPham.remove(i);
                fileIOSanPham.SanPhamWriteToCSV(listSanPham);
                break;
            }
        }
    }

}
