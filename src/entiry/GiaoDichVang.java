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
public class GiaoDichVang extends GiaoDich implements TinhTien {
    private String loaiVang;

    public GiaoDichVang() {
    }

    public GiaoDichVang(int ma, String ngayGD, float donGia, int soLuong, String loaiVang) {
        super(ma, ngayGD, donGia, soLuong);
    }

    public String getLoaiVang() {
        return loaiVang;
    }
   
    @Override
    public float getTienTe() {
        if(loaiVang.equals("9999")){
            this.setTien(this.getDonGia() * this.getSoLuong());
        }
        else if(loaiVang.equals("18k")){
            this.setTien((float) (this.getDonGia() * this.getSoLuong() * 0.8));
        }
        else if(loaiVang.equals("16k")){
            this.setTien((float) (this.getDonGia() * this.getSoLuong() * 0.6));
        }
        return this.getTien();
    }
    
    
}
