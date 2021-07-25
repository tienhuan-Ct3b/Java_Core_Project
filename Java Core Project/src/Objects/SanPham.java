package Objects;

import java.time.LocalDate;

public class SanPham {

    private String maSanPham;
    private String tenSanPham;
    private String nhaSX;
    private String loaiSanPham;
    private int soLuong;
    private String donViTinh;
    private int giaNhap;
    private int giaBan;
    private LocalDate NSX;
    private LocalDate HSD;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, String nhaSX, String loaiSanPham, int soLuong, String donViTinh, int giaNhap, LocalDate NSX, LocalDate HSD) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.nhaSX = nhaSX;
        this.loaiSanPham = loaiSanPham;
        this.soLuong = soLuong;
        this.donViTinh = donViTinh;
        this.giaNhap = giaNhap;
        this.NSX = NSX;
        this.HSD = HSD;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
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

    @Override
    public String toString() {
        return "SanPham{" + "maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", nhaSX=" + nhaSX + ", loaiSanPham=" + loaiSanPham + ", soLuong=" + soLuong + ", donViTinh=" + donViTinh + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + ", NSX=" + NSX + ", HSD=" + HSD + '}';
    }
}
