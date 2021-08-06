package Objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
import java.time.LocalDate;

public class SanPham {

    private static int maSanPhamLast = 10000;

    @SerializedName("maSanPham")
    @Expose
    @CsvBindByPosition(position = 0)
    private int maSanPham;

    @SerializedName("tenSanPham")
    @Expose
    @CsvBindByPosition(position = 1)
    private String tenSanPham;

    @SerializedName("nhaSX")
    @Expose
    @CsvBindByPosition(position = 2)
    private String nhaSX;

    @SerializedName("loaiSanPham")
    @Expose
    @CsvBindByPosition(position = 3)
    private String loaiSanPham;

    @SerializedName("soLuong")
    @Expose
    @CsvBindByPosition(position = 4)
    private int soLuong;

    @SerializedName("donViTinh")
    @Expose
    @CsvBindByPosition(position = 5)
    private String donViTinh;

    @SerializedName("giaNhap")
    @Expose
    @CsvBindByPosition(position = 6)
    private int giaNhap;

    @SerializedName("giaBan")
    @Expose
    @CsvBindByPosition(position = 7)
    private int giaBan;

    @SerializedName("NSX")
    @Expose
    @CsvDate(value = "yyyy-MM-dd")
    @CsvBindByPosition(position = 8)
    private LocalDate NSX;

    @SerializedName("HSD")
    @Expose
    @CsvDate(value = "yyyy-MM-dd")
    @CsvBindByPosition(position = 9)
    private LocalDate HSD;

    public SanPham() {
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

    public void setGiaBan() {
        this.giaBan = (int) (getGiaNhap() * 1.2);
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

    public boolean testTrungSanPham(SanPham sp) {
        if (sp.getTenSanPham().equals(this.getTenSanPham()) && sp.getNSX().equals(this.getNSX())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", nhaSX=" + nhaSX + ", loaiSanPham=" + loaiSanPham + ", soLuong=" + soLuong + ", donViTinh=" + donViTinh + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + ", NSX=" + NSX + ", HSD=" + HSD + '}';
    }

}
