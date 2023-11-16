package Model;

import java.util.Date;

public class PGiaoHang {

    private int id;
    private int ten;
    private double giaTien;
    private double tongChi;
    private int diaChi;
    private Date ngayTao;
    private Date ngayGiao;
    private Date ngaySua;
    private int chungTu;
    private String trangThai;

    public PGiaoHang() {
    }

    public PGiaoHang(int id, int ten, double giaTien, double tongChi, int diaChi, Date ngayTao, Date ngayGiao, Date ngaySua, int chungTu, String trangThai) {
        this.id = id;
        this.ten = ten;
        this.giaTien = giaTien;
        this.tongChi = tongChi;
        this.diaChi = diaChi;
        this.ngayTao = ngayTao;
        this.ngayGiao = ngayGiao;
        this.ngaySua = ngaySua;
        this.chungTu = chungTu;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTen() {
        return ten;
    }

    public void setTen(int ten) {
        this.ten = ten;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public double getTongChi() {
        return tongChi;
    }

    public void setTongChi(double tongChi) {
        this.tongChi = tongChi;
    }

    public int getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(int diaChi) {
        this.diaChi = diaChi;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayGiao() {
        return ngayGiao;
    }

    public void setNgayGiao(Date ngayGiao) {
        this.ngayGiao = ngayGiao;
    }

    public Date getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(Date ngaySua) {
        this.ngaySua = ngaySua;
    }

    public int getChungTu() {
        return chungTu;
    }

    public void setChungTu(int chungTu) {
        this.chungTu = chungTu;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    
    

   
}
