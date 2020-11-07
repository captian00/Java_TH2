/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import entiry.GiaoDich;
import Model.QLGD;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Cap
 */
public class Main {

    public static void main(String[] args) {
        QLGD qlgd = new QLGD();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("0. Thoat.");
            System.out.println("1. Nhap giao dich vang.");
            System.out.println("2. Nhap giao dich tien.");
            System.out.println("3. Viet danh sach giao dich.");
            System.out.println("4. Sua giao dich theo ma.");
            System.out.println("5. Sap xep giao dich theo don gia.");
            System.out.println("6. Dua ra giao dich vang lon nhat theo tung loai.");
            System.out.print("Nhap lua chon: ");
            int choose = Integer.parseInt(in.nextLine());
            if (choose == 0) {
                break;
            } else if (choose == 1) {
                qlgd.nhapVang();
            } else if (choose == 2) {
                qlgd.nhapTien();
            } else if (choose == 3) {
                qlgd.vietDS();
            } else if (choose == 4) {
                qlgd.suaGD();
            } else if (choose == 5) {
//                qlgd.sapXepGD();
            } else if (choose == 6) {
//                qlgd.maxVang();
            }
        }

    }
}
