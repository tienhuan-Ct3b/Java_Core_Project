package Objects;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
import java.time.LocalDate;

public class SanPham {

    private static int maSanPhamLast = 10000;
    @CsvBindByPosition(position = 0)
    private int maSanPham;
    @CsvBindByPosition(position = 1)
    private String tenSanPham;
    @CsvBindByPosition(position = 2)
    private String nhaSX;
    @CsvBindByPosition(position = 3)
    private String loaiSanPham;
    @CsvBindByPosition(position = 4)
    private int soLuong;
    @CsvBindByPosition(position = 5)
    private String donViTinh;
    @CsvBindByPosition(position = 6)
    private int giaNhap;
    @CsvBindByPosition(position = 7)
    private int giaBan;
    @CsvDate(value = "yyyy-MM-dd")
    @CsvBindByPosition(position = 8)
    private LocalDate NSX;
    @CsvDate(value = "yyyy-MM-dd")
    @CsvBindByPosition(position = 9)
    private LocalDate HSD;

    public SanPham() {
        this.maSanPham = ++maSanPhamLast;
    }

    public SanPham(String tenSanPham, String nhaSX, String loaiSanPham, int soLuong, String donViTinh, int giaNhap, LocalDate NSX, LocalDate HSD) {
        this.maSanPham = ++maSanPhamLast;
        this.tenSanPham = tenSanPham;
        this.nhaSX = nhaSX;
        this.loaiSanPham = loaiSanPham;
        this.soLuong = soLuong;
        this.donViTinh = donViTinh;
        this.giaNhap = giaNhap;
        this.NSX = NSX;
        this.HSD = HSD;
    }

    public static void setMaSanPhamLast(int maSanPhamLast) {
        SanPham.maSanPhamLast = maSanPhamLast;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaNhap) {
        this.giaBan = (int) (giaNhap * 1.2);
    }

    public LocalDate getNSX() {
        return NSX;
    }

    public void setNSX(LocalDate NSX) {
        this.NSX = NSX;
    }

    public LocalDate getHSD() {
        return HSD;
    }

    public void setHSD(LocalDate HSD) {
        this.HSD = HSD;
    }

    public boolean testTrungTenSanPham(SanPham sp) {
        if (sp.getTenSanPham().equals(this.getTenSanPham())) {
            return true;
        }
        return false;
    }

    public boolean testTrungMaSP(SanPham sp) {
        if (sp.getMaSanPham() == this.maSanPham) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", nhaSX=" + nhaSX + ", loaiSanPham=" + loaiSanPham + ", soLuong=" + soLuong + ", donViTinh=" + donViTinh + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + ", NSX=" + NSX + ", HSD=" + HSD + '}';
    }

}
