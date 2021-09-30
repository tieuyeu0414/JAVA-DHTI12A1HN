/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 *
 * @author hailo
 */
public class TestProduct {
    static void menu() {
        System.out.println("Menu \n");
        System.out.println("1.nhap n \n");
        System.out.println("2.hien thi \n");
        System.out.println("3.tim hang gia cao nhat \n");
        System.out.println("4.hien thi sap xep \n");
        System.out.println("5.tim hang sua \n");
        System.out.println("0.thoat \n");
    }
    public static void main(String[] args) {
       int n;
       ArrayList<ProductBai2> arrlist = new ArrayList<ProductBai2>();
       
       Scanner sc = new Scanner(System.in);
       do {
            menu();
            System.out.println("Nhap vao lua chon cua ban: ");        
            n = sc.nextInt();
            switch (n) {
                case 1: {
                    int m;
                    System.out.println("Nhap vao m: ");
                    m = sc.nextInt();
                    for(int i = 0; i < m; i++){
                        System.out.println("Nhap hang hoa thu " + (i + 1));
                        ProductBai2 productbai2 = new ProductBai2();
                        productbai2.input();
                        arrlist.add(productbai2);
                    }
                    System.out.println("\n");
                    break;
                }
                case 2: {
                    System.out.println("du lieu ban vua nhap la :");
                    int i =1;
                    for (ProductBai2 ProducBai2 : arrlist) {
                        System.out.println("san pham thu :"+(i));
                        ProducBai2.display();
                        i++;
                    }
                    System.out.println("\n");
                    break;
                }
                case 3:{
                    float max = 0;
                    for (ProductBai2 ProducBai2 : arrlist) {
                        if (max < ProducBai2.getGia1SP()) {
                            max = ProducBai2.getGia1SP();
                        }
                    }
                    System.out.println("thong tin mat hang co gia cao nhat la :");
                    for (ProductBai2 ProducBai2 : arrlist) {
                        if (ProducBai2.getGia1SP() == max) {
                            ProducBai2.display();
                        }
                    }
                    System.out.println("\n");
                    break;
                }
                case 4: {
                    Collections.sort(arrlist, new Comparator<ProductBai2>() {
                        public int compare(ProductBai2 pr1, ProductBai2 pr2) {
                            if (pr1.getGia1SP() < pr2.getGia1SP()) {
                                return 1;
                            } 
                            else {
                                if (pr1.getGia1SP() == pr2.getGia1SP()) {
                                    return 0;
                                } 
                                else {
                                    return -1;
                                }
                            }
                        }
                    });
                    System.out.println("danh sach duoc sap xep giam dan theo gia la:");
                    int i=1;
                    for (ProductBai2 ProductBai2 : arrlist) {
                        System.out.println("san pham thu :"+(i));
                        ProductBai2.display();
                        i++;
                    }
                    System.out.println("\n");
                    break;
                }
                case 5: {
                    for (ProductBai2 ProductBai2 : arrlist){ 
                        if (ProductBai2.getTenHH().equals("sua") || ProductBai2.getTenHH().equals("SUA")){
                            ProductBai2.display();
                        }
                    }
                    System.out.println("\n");
                    break;
                }
                case 0: break;
                default: {
                    System.out.println("khong co lua chon cua ban ");
                    break;
                }
            }
       }while (n != 0);
    }

    private static ProductBai2 input() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
