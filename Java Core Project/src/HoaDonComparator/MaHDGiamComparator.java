/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HoaDonComparator;

import Objects.HoaDon;
import java.util.Comparator;

/**
 *
 * @author admin
 */
public class MaHDGiamComparator implements Comparator<HoaDon> {

    @Override
    public int compare(HoaDon o1, HoaDon o2) {
        if (o1.getMaHoaDon() > o2.getMaHoaDon()) {
            return -1;
        } else if (o1.getMaHoaDon() == o2.getMaHoaDon()) {
            return 0;
        }
        return 1;
    }
}
