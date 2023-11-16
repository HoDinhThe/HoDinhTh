
package Model;

import java.util.Date;


public class SanPham {
    private int id;
    private String tensp;
    private double giasp;
    private Date ngayTao;
    private int khachHang;
    private int vatLieu;
    private int daBan;
    private int doDay;
    private Date ngCapnhat;
    private String moTa;
    private String trangThai;

    public SanPham() {
    }

    public SanPham(int id, String tensp, double giasp, Date ngayTao, int khachHang, int vatLieu, int daBan, int doDay, Date ngCapnhat, String moTa, String trangThai) {
        this.id = id;
        this.tensp = tensp;
        this.giasp = giasp;
        this.ngayTao = ngayTao;
        this.khachHang = khachHang;
        this.vatLieu = vatLieu;
        this.daBan = daBan;
        this.doDay = doDay;
        this.ngCapnhat = ngCapnhat;
        this.moTa = moTa;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public double getGiasp() {
        return giasp;
    }

    public void setGiasp(double giasp) {
        this.giasp = giasp;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(int khachHang) {
        this.khachHang = khachHang;
    }

    public int getVatLieu() {
        return vatLieu;
    }

    public void setVatLieu(int vatLieu) {
        this.vatLieu = vatLieu;
    }

    public int getDaBan() {
        return daBan;
    }

    public void setDaBan(int daBan) {
        this.daBan = daBan;
    }

    public int getDoDay() {
        return doDay;
    }

    public void setDoDay(int doDay) {
        this.doDay = doDay;
    }

    public Date getNgCapnhat() {
        return ngCapnhat;
    }

    public void setNgCapnhat(Date ngCapnhat) {
        this.ngCapnhat = ngCapnhat;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    
   
   
    
}
