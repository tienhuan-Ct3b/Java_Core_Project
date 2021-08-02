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
        listSanPham.add(s);
        fileIOSanPham.SanPhamWriteToCSV(listSanPham);
    }

    public void ThemSp(List<SanPham> list) {
        list.forEach(s -> {
            ThemSP(s);
        });
    }

    //sản phẩm 1 là sản phẩm cần sửa, sản phẩm 2 là sản phẩm sau khi đã sửa.
    public void SuaSP(SanPham s) {
        for (int i = 0; i < listSanPham.size(); i++) {
            if (listSanPham.get(i).getMaSanPham() == s.getMaSanPham()) {
                listSanPham.get(i).setTenSanPham(s.getTenSanPham());
                listSanPham.get(i).setNhaSX(s.getNhaSX());
                listSanPham.get(i).setLoaiSanPham(s.getLoaiSanPham());
                listSanPham.get(i).setSoLuong(s.getSoLuong());
                listSanPham.get(i).setDonViTinh(s.getDonViTinh());
                listSanPham.get(i).setGiaNhap(s.getGiaNhap());
                listSanPham.get(i).setGiaBan(s.getGiaNhap());
                listSanPham.get(i).setNSX(s.getNSX());
                listSanPham.get(i).setHSD(s.getHSD());
            }
        }
    }

    public void SuaSoLuongSp(SanPham s) {
        for (int i = 0; i < listSanPham.size(); i++) {
            if (listSanPham.get(i).getMaSanPham() == s.getMaSanPham()) {
                
            }
        }
    }

    public void XoaSP(SanPham s) {
        for (int i = 0; i < listSanPham.size(); i++) {
            if (listSanPham.get(i).getMaSanPham() == s.getMaSanPham()) {
                listSanPham.remove(i);
            }
        }
    }
}
