/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author hailo
 */
public class Test {
    static void menu() {
        System.out.println("Menu ");
        System.out.println("1.nhap n \n");
        System.out.println("2.hien thi \n");
        System.out.println("3.Sap xep giam them nam \n");
        System.out.println("4.Tim ten sach \n");
        System.out.println("5.tim ten tac gia \n");
        System.out.println("0.thoat \n");
    }
    public static void main(String[] args) {
       int n;      
       UnetiBook a[] = null;
       Scanner sc = new Scanner(System.in);
       do {
            menu();
            System.out.print("Nhap vao lua chon cua ban: ");        
            n = sc.nextInt();
            switch (n) {
                 case 1: {
                    int m;
                    System.out.print("Nhap vao m: ");
                    m = sc.nextInt();
                    a = new UnetiBook[m];
                    for (int i = 0; i < m; i++) {
                        System.out.println("\n");
                        System.out.println("Nhap hang hoa thu " + (i + 1));
                        a[i] = new UnetiBook();
                        a[i].input();
                    }
                    System.out.println("\n");
                    break;
                }
                 case 2: {
                    if (a == null) {
                        System.out.print("ban chua nhap du lieu");
                    } 
                    else {
                        System.out.println("du lieu ban vua nhap la :");
                        for (int i = 0; i < a.length; i++) {
                            System.out.println("thong tin hang hoa thu " + (i + 1));
                            a[i].display();
                            System.out.println("\n");
                        }
                    }
                    System.out.println("\n");
                    break;
                }
                case 3: {
                    if (a == null) {
                        System.out.println("ban chua nhap du lieu");
                    } 
                    else {
                        for (int i = 0; i < a.length; i++) {
                            for (int j = i + 1; j < a.length; j++) {
                                if (a[i].getYearPublishing() < a[j].getYearPublishing()){
                                    UnetiBook tem = a[i];
                                    a[i] = a[j];
                                    a[j] = tem;
                                }
                            }
                            System.out.println("thong tin hang hoa thu " + (i + 1));
                            a[i].display();
                        }
                    }
                    System.out.println("\n");
                    break;
                }
                case 4: {
                    Scanner sc1 = new Scanner(System.in);
                    System.out.print("nhap ten sach:");
                    String nameBook = sc1.nextLine();
                    int dem = 0;
                    System.out.println("thong tin sach ban muon tim la :");
                    for (int i = 0; i < a.length; i++) {
                        if(a[i].getBookName().equals(nameBook)){
                            System.out.println("thong tin hang hoa thu " + (i + 1));
                            a[i].display();
                            System.out.println("\n");
                            dem++;
                        }
                    }
                    if(dem == 0){
                        System.out.println("khong co sach ban muon tim");
                    }
                    System.out.println("\n");
                    break;
                }
                case 5: {
                    Scanner sc1 = new Scanner(System.in);
                    System.out.print("nhap tac gia:");
                    String nameAuthor = sc1.nextLine();
                    int dem = 0;
                    System.out.println("thong tin tac gia ban muon tim la :");
                    for (int i = 0; i < a.length; i++) {
                        if(a[i].getBookAuthor().equals(nameAuthor)){
                            System.out.println("thong tin hang hoa thu " + (i + 1));
                            a[i].display();
                            System.out.println("\n");
                            dem++;
                        }
                    }
                    if(dem == 0){
                        System.out.println("khong co tac gia ban muon tim");
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
}
