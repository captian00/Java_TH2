/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entiry;

/**
 *
 * @author Cap
 */
public class GiaoDich {

    private int ma;
    private String ngayGD;
    private float donGia;
    private int soLuong;
    private float tien;

    public GiaoDich() {
    };
    public GiaoDich(int ma, String ngayGD, float donGia, int soLuong) {
        this.ma = ma;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public GiaoDich(int ma, String ngayGD, float donGia, int soLuong, float tien) {
        this.ma = ma;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.tien = tien;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getTien() {
        return tien;
    }

    public void setTien(float tien) {
        this.tien = tien;
    }
    public String toString(){
        return String.format("%-15d%-15s%-15f%-15d", getMa(),getNgayGD(),getDonGia(),getSoLuong() );
    }

}
