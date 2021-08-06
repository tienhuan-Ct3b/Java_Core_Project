/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIOCSV;

import Objects.SanPham;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class FileIOSanPham {

    private static final String currentDir = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private final String StrSanPham = currentDir + separator + "data" + separator + "SanPham.csv";
    public File FileSanPham = new File(StrSanPham);

    public void SanPhamWriteToCSV(List<SanPham> list) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(FileSanPham);
            CSVWriter csvWriter = new CSVWriter(fw,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
            String[] header = {"Ma San Pham", "Ten San Pham", "Nha San Xuat", "Loai San Pham", "So Luong", "Don Vi Tinh", "Gia Nhap", "Gia Ban", "Ngay San Xuat", "Han Su Dung"};
            csvWriter.writeNext(header);
            for (SanPham sp : list) {
                csvWriter.writeNext(new String[]{
                    String.valueOf(sp.getMaSanPham()),
                    sp.getTenSanPham(),
                    sp.getNhaSX(),
                    sp.getLoaiSanPham(),
                    String.valueOf(sp.getSoLuong()),
                    sp.getDonViTinh(),
                    String.valueOf(sp.getGiaNhap()),
                    String.valueOf(sp.getGiaBan()),
                    String.valueOf(sp.getNSX()),
                    String.valueOf(sp.getHSD())
                });
            }
        } catch (IOException ex) {
            Logger.getLogger(FileIOHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(FileIOSanPham.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public List<SanPham> SanPhamReadCSV() {
        List<SanPham> list = new ArrayList<>();
        FileReader fr = null;
        try {
            fr = new FileReader(StrSanPham);
            CsvToBean<SanPham> csvToBean = new CsvToBeanBuilder<SanPham>(fr)
                    .withType(SanPham.class)
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
                Logger.getLogger(FileIOSanPham.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
}
