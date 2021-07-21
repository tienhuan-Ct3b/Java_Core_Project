/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HoaDon;

import java.util.*;
import java.time.*;

/**
 *
 * @author Admin
 */
public class Do_An {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    static LocalDate Input() {
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        LocalDate datefirst = LocalDate.of(y, m, d);
        return datefirst;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Hoa_Don_Ban_Hang> list1 = new LinkedList<>();
        LinkedList<Hoa_Don_Nhap_Hang> list2 = new LinkedList<>();
        int chon;
        do {//chon so khac 1,2,3,4,5 de ket thuc
            chon = sc.nextInt();
            switch (chon) {
                case 1: {
                    //add
                    int a = sc.nextInt(); //giam gia
                    sc.nextLine();
                    String b = sc.nextLine();  //MA HOA DON
                    LocalDate c = Input();   //ngay lap
                    sc.nextLine();
                    String d = sc.nextLine();//MA HANG
                    int e = sc.nextInt();//so luong
                    int f = sc.nextInt();//gia
                    long g = e * f;//thanh tien
                    Hoa_Don_Ban_Hang hoadon = new Hoa_Don_Ban_Hang(a, b, c, d, e, f, g);
                    list1.add(hoadon);
                    System.out.println("==================================");
                    break;
                }
                case 2: {
                    //update
                    //dung ma hoa don de tim doi tuong de update
                    sc.nextLine();
                    String maupdate = sc.nextLine();// update hoa don co ma nay
                    for (int i = 0; i < list1.size(); i++) {
                        if (list1.get(i).getMaHoaDon().equals(maupdate)) {
                            /* 
                            1:giam gia
                            2:ma hoa don
                            3:ngay lap
                            4:ma hang
                            5:so luong
                            6:gia
                             */
                            int update;
                            do//chon so khac 1,2,3,4,5,6,7 de ket thuc
                            {
                                update = sc.nextInt();//chon doi tuong can update 
                                switch (update) {
                                    case 1: {
                                        int giamgia;
                                        giamgia = sc.nextInt();
                                        list1.get(i).setGiamGia(giamgia);
                                        break;
                                    }
                                    case 2: {
                                        String mahoadon;
                                        sc.nextLine();
                                        mahoadon = sc.nextLine();
                                        list1.get(i).setMaHoaDon(mahoadon);
                                        break;
                                    }
                                    case 3: {
                                        LocalDate ngaylap;
                                        ngaylap = Input();
                                        list1.get(i).setNgayLap(ngaylap);
                                        break;
                                    }
                                    case 4: {
                                        String mahang;
                                        sc.nextLine();
                                        mahang = sc.nextLine();
                                        list1.get(i).setMaHang(mahang);
                                        break;
                                    }
                                    case 5: {
                                        int soluong = sc.nextInt();
                                        long thanhtien = soluong * list1.get(i).getGia();
                                        list1.get(i).setSoLuong(soluong);
                                        list1.get(i).setThanhTien(thanhtien);
                                        break;
                                    }
                                    case 6: {
                                        int gia = sc.nextInt();
                                        long thanhtien = gia * list1.get(i).getSoLuong();
                                        list1.get(i).setGia(gia);
                                        list1.get(i).setThanhTien(thanhtien);
                                        break;
                                    }
                                }
                            } while (update <= 6);
                        }
                    }
                    System.out.println("==================================");
                    break;
                }
                case 3: {
                    //remove
                    //dung ma hoa don de tim doi tuong de xoa
                    sc.nextLine();
                    String maxoa = sc.nextLine();// xoa hoa don co ma nay
                    for (int i = 0; i < list1.size(); i++) {
                        if (list1.get(i).getMaHoaDon().equals(maxoa)) {
                            list1.remove(i);
                        }
                    }
                    System.out.println("==================================");
                    break;
                }
                case 4: {
                    //show
                    for (int i = 0; i < list1.size(); i++) {
                        System.out.println(list1.get(i));
                    }
                    System.out.println("==================================");
                    break;
                }
                case 5: {
                    System.out.println("==================================");
                    break;
                }
            }
        } while (chon <= 5);
    }

}
