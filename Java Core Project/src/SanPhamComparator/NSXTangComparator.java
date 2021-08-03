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
public class NSXTangComparator implements Comparator<SanPham> {

    @Override
    public int compare(SanPham s1, SanPham s2) {
        return s1.getNSX().compareTo(s2.getNSX());
    }
}
