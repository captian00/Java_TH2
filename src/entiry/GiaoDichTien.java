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
public class GiaoDichTien extends GiaoDich implements TinhTien {
    private String loaiTien;

    public GiaoDichTien() {
    }

    public GiaoDichTien(int ma, String ngayGD, float donGia, int soLuong, String loaiTien) {
        super(ma, ngayGD, donGia, soLuong);
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }
    
    
    
    @Override
    public float getTienTe() {
        if(loaiTien.equals("VN")){
            this.setTien(this.getSoLuong() * this.getSoLuong());
        }
        else if(loaiTien.equals("USD")){
            this.setTien(this.getDonGia() * this.getSoLuong() * 23);
        }
        else if(loaiTien.equals("EURO")){
            this.setTien(this.getDonGia() * this.getSoLuong() * 26);
        }
        return this.getTien();
    }
   
    
}
