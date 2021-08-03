/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SanPhamComparator;

import Objects.SanPham;
import java.util.Comparator;

/**
 *
 * @author admin
 */
public class GiaNhapTangComparator implements Comparator<SanPham> {

    @Override
    public int compare(SanPham s1, SanPham s2) {
        if (s1.getGiaNhap() > s2.getGiaNhap()) {
            return 1;
        } else if (s1.getGiaNhap() == s2.getGiaNhap()) {
            return 0;
        }
        return -1;
    }
}
