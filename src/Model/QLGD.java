/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entiry.GiaoDich;
import entiry.GiaoDichVang;
import entiry.GiaoDichTien;

/**
 *
 * @author Cap
 */
public class QLGD implements ChucNang {

    private List<GiaoDich> giaoDiches;
    private Scanner in;

    public QLGD() {
        giaoDiches = new ArrayList<>();
        in = new Scanner(System.in);
        giaoDiches.add(new GiaoDichVang(1, "18/06/2000", 06, 18, "9999"));
        giaoDiches.add(new GiaoDichVang(2, "19/06/2000", 07, 18, "18k"));
        giaoDiches.add(new GiaoDichVang(3, "20/06/2000", 8, 18, "9999"));
        giaoDiches.add(new GiaoDichVang(4, "21/06/2000", 9, 18, "16k"));
        giaoDiches.add(new GiaoDichVang(5, "22/06/2000", 06, 18, "9999"));

    }

    private int createMa() {
        int Ma = -1;
        for (GiaoDich gd : giaoDiches) {
            if (gd.getMa() > Ma) {
                Ma = gd.getMa();
            }
        }
        return Ma + 1;
    }

    private int checkMa(int Ma) {
        int i = 0;
        for (GiaoDich gd : giaoDiches) {
            if (gd.getMa() == Ma) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override
    public void nhapVang() {
        String ngayGD;
        float donGia;
        int soLuong;
        String loaiVang;

        while (true) {
            System.out.print("Nhap ngay giao dich(dd/MM/yyyy): ");
            ngayGD = in.nextLine();
            String regex = "[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}";
            if (ngayGD.matches(regex)) {
                break;
            } else {
                System.out.println("Nhap sai . Nhap lai");
            }
        }
        while (true) {
            System.out.print("Nhap don gia: ");
            donGia = Float.parseFloat(in.nextLine());
            if (donGia > 0) {
                break;
            } else {
                System.out.println("Nhap sai. Nhap lai");
            }

        }
        while (true) {
            System.out.print("Nhap so luong: ");
            soLuong = Integer.parseInt(in.nextLine());
            if (soLuong > 0) {
                break;
            } else {
                System.out.println("Nhap sai. Nhap lai");
            }
        }
        while (true) {
            System.out.print("Nhap loai vang: ");
            loaiVang = (in.nextLine());
            if (loaiVang.equals("9999") || loaiVang.equals("18k") || loaiVang.equals("16k")) {
                break;
            } else {
                System.out.println("Nhap sai. Nhap lai");
            }
        }
        giaoDiches.add(new GiaoDichVang(createMa(),ngayGD,donGia,soLuong,loaiVang));
    }

    @Override
    public void nhapTien() {
        String ngayGD;
        float donGia;
        int soLuong;
        String loaiTien;

        while (true) {
            System.out.print("Nhap ngay giao dich(dd/MM/yyyy): ");
            ngayGD = in.nextLine();
            String regex = "[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}";
            if (ngayGD.matches(regex)) {
                break;
            } else {
                System.out.println("Nhap sai . Nhap lai");
            }
        }
        while (true) {
            System.out.print("Nhap don gia: ");
            donGia = Float.parseFloat(in.nextLine());
            if (donGia > 0) {
                break;
            } else {
                System.out.println("Nhap sai. Nhap lai");
            }

        }
        while (true) {
            System.out.print("Nhap so luong: ");
            soLuong = Integer.parseInt(in.nextLine());
            if (soLuong > 0) {
                break;
            } else {
                System.out.println("Nhap sai. Nhap lai");
            }
        }
        while (true) {
            System.out.print("Nhap loai vang: ");
            loaiTien = (in.nextLine());
            if (loaiTien.equals("VND") || loaiTien.equals("USD") || loaiTien.equals("EURO")) {
                break;
            } else {
                System.out.println("Nhap sai. Nhap lai");
            }
        }
        giaoDiches.add(new GiaoDichTien(createMa(),ngayGD,donGia,soLuong,loaiTien));
    }

    @Override
    public void vietDS() {
        for (GiaoDich gd : giaoDiches) {
            System.out.println(gd.toString());
        }
    }

    @Override
    public void suaGD() {
        while (true) {
            System.out.println("Nhap ma gd can sua: ");
            int ma;
            ma = Integer.parseInt(in.nextLine());
            int index = checkMa(ma);
            if (index >= 0) {
                GiaoDich x = giaoDiches.get(index);
                String ngayGD;
                float DonGia;
                while (true) {
                    System.out.print("Nhap ngay giao dich(dd/MM/yyyy): ");
                    ngayGD = in.nextLine();
                    String regex = "[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}";
                    if (ngayGD.matches(regex)) {
                        break;
                    } else {
                        System.out.println("Nhap sai . Nhap lai");
                    }
                }
                while (true) {
                    System.out.print("Nhap don gia: ");
                    DonGia = Float.parseFloat(in.nextLine());
                    if (DonGia > 0) {
                        break;
                    } else {
                        System.out.println("Nhap sai. Nhap lai");
                    }
                }
                x.setDonGia(DonGia);
                x.setNgayGD(ngayGD);
                break;
            }
            else System.out.println("Khong ton tai ma nay!");
        }

    }

    @Override
    public void sapXep() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void maxVang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
