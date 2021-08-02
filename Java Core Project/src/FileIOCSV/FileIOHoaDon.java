/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIOCSV;

import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Objects.HoaDonBanHang;
import Objects.HoaDonNhapHang;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class FileIOHoaDon {

    private static final String currentDir = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private final String StrHoaDonBanHang = currentDir + separator + "data" + separator + "HoaDonBanHang.csv";
    private final String StrHoaDonNhapHang = currentDir + separator + "data" + separator + "HoaDonNhapHang.csv";
    public File FileHoaDonBanHang = new File(StrHoaDonBanHang);
    public File FileHoaDonNhapHang = new File(StrHoaDonNhapHang);

    public void BanHangWriteToCSV(List<HoaDonBanHang> list) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(FileHoaDonBanHang);
            CSVWriter csvWriter = new CSVWriter(fw,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
            String[] header = {"Ma Hoa Don", "Ngay Lap", "San Pham", "Giam Gia", "Tong Tien"};
            csvWriter.writeNext(header);
            for (HoaDonBanHang hdbh : list) {
                csvWriter.writeNext(new String[]{
                    String.valueOf(hdbh.getMaHoaDon()),
                    String.valueOf(hdbh.getNgayLap()),
                    hdbh.getSanPham().toString(),
                    String.valueOf(hdbh.getGiamGia()),
                    String.valueOf(hdbh.getThanhTien())});
            }
        } catch (IOException ex) {
            Logger.getLogger(FileIOHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(FileIOHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public List<HoaDonBanHang> BanHangReadCSV() {
        List<HoaDonBanHang> list = new ArrayList<>();
        FileReader fr = null;
        try {
            fr = new FileReader(FileHoaDonBanHang);
            CsvToBean<HoaDonBanHang> csvToBean = new CsvToBeanBuilder<HoaDonBanHang>(fr)
                    .withType(HoaDonBanHang.class)
                    .withSkipLines(1)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            list = csvToBean.parse();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileIOHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(FileIOHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    public void NhapHangWriteToCSV(List<HoaDonNhapHang> list) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(FileHoaDonNhapHang);
            CSVWriter csvWriter = new CSVWriter(fw,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);

            String[] header = {"Ma Hoa Don", "Ngay Lap", "San Pham", "Nha San Xuat", "Tong Tien"};
            csvWriter.writeNext(header);
            for (HoaDonNhapHang hdnh : list) {
                csvWriter.writeNext(new String[]{
                    String.valueOf(hdnh.getMaHoaDon()),
                    String.valueOf(hdnh.getNgayLap()),
                    String.valueOf(hdnh.getNhaSanXuat()),
                    hdnh.getSanPham().toString(),
                    String.valueOf(hdnh.getThanhTien())});
            }
        } catch (IOException ex) {
            Logger.getLogger(FileIOHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(FileIOHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public List<HoaDonNhapHang> NhapHangReadCSV() {
        List<HoaDonNhapHang> list = new ArrayList<>();
        FileReader fr = null;
        try {
            fr = new FileReader(StrHoaDonNhapHang);
            CsvToBean<HoaDonNhapHang> csvToBean = new CsvToBeanBuilder<HoaDonNhapHang>(fr)
                    .withType(HoaDonNhapHang.class)
                    .withSkipLines(1)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            list = csvToBean.parse();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileIOHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(FileIOHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
}
