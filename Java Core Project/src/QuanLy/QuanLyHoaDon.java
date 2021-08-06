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
        int index1 = listHDBanHang.size() - 1;
        int index2 = listHDNhapHang.size() - 1;
        if (index1 != -1) {
            int lastMaHDBH = listHDBanHang.get(index1).getMaHoaDon();
            if (index2 != -1) {
                int lastMaHDNH = listHDNhapHang.get(index2).getMaHoaDon();
                if (lastMaHDBH > lastMaHDNH) {
                    return lastMaHDBH;
                } else {
                    return lastMaHDNH;
                }
            }
            return lastMaHDBH;
        } else if (index2 != -1) {
            return listHDNhapHang.get(index2).getMaHoaDon();
        }
        return -1;
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
    
    public void XoaHoaDonBanHang(int maHoaDon) {
        int i;
        for (i = 0; i < listHDBanHang.size(); i++) {
            if (listHDBanHang.get(i).getMaHoaDon() == maHoaDon) {
                listHDBanHang.remove(i);
                fileIOHoaDon.BanHangWriteToJson(listHDBanHang);
                break;
            }
        }        
    }
    
    public void XoaHoaDonNhapHang(int maHoaDon) {
        int i;
        for (i = 0; i < listHDNhapHang.size(); i++) {
            if (listHDNhapHang.get(i).getMaHoaDon() == maHoaDon) {
                listHDNhapHang.remove(i);
                fileIOHoaDon.NhapHangWriteToJson(listHDNhapHang);
                break;
            }
        }        
    }
}
