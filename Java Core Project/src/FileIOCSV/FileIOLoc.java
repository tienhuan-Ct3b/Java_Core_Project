package FileIOCSV;

import Objects.SanPham;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FileIOLoc {

    private static final String currentDir = System.getProperty("user.dir");
    private static final String separator = File.separator;

    public void SanPhamWriteToCSV(List<SanPham> list, String s) {
        LocalDate now = LocalDate.now();
        DateTimeFormatter dtfm = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = dtfm.format(now);
        String fileName = s + date;
        String file = currentDir + separator + "data" + separator + "Loc" + separator + s + separator + fileName;
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
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
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
            }
        }
    }
}
