/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author hailo
 */
public class productmenu {
    static void menu() {
        System.out.println("Menu \n");
        System.out.println("1.nhap n \n");
        System.out.println("2.hien thi \n");
        System.out.println("3.hien thi sap xep \n");
        System.out.println("0.thoat \n");
    }
    public static void main(String[] args) {
        int n;
        Product a = new Product();
        Product product[] = null;
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
                    product = new Product[m];
                    for (int i = 0; i < m; i++) {
                        System.out.println("Nhap hang hoa thu " + (i + 1));
                        product[i] = new Product();
                        product[i].nhap();
                    }
                    System.out.println("\n");
                    break;
                }
                
                case 2: {
                    if (product == null) {
                        System.out.println("ban chua nhap du lieu");
                    } 
                    else {
                        System.out.println("du lieu ban vua nhap la :");
                        for (int i = 0; i < product.length; i++) {
                            System.out.println("thong tin hang hoa thu " + (i + 1));
                            product[i].hienthi();
                        }
                    }
                    System.out.println("\n");
                    break;
                }
                case 3: {
                    if (product == null) {
                        System.out.println("ban chua nhap du lieu");
                    } 
                    else {
                        a.sort(product);
                        System.out.println("du lieu sau khi sap xep la :");
                        for (int i = 0; i < product.length; i++) {
                            System.out.println("thong tin hang hoa thu " + (i + 1));
                            product[i].hienthi();
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
        } while (n != 0);
    }
}
