/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author hailo
 */
public class Manager {
    static void menu() {
        System.out.print("\n");
        System.out.print("Menu \n");
        System.out.print("1.nhap thong tin dien thoai \n");
        System.out.print("2.nhap thong tin oto \n");
        System.out.print("3.hien thi thong tin dien thoai và oto \n");
        System.out.print("4.Tim kiem theo ten nha san xuat \n");
        System.out.print("0.thoat \n");
    }
    public static void main(String[] args) {
        int n;
        Mobile mobile[] = null;
        Car car[] = null;
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            System.out.print("Nhap vao lua chon cua ban: ");        
            n = sc.nextInt();
            switch (n) {
                case 1: {
                    int m;
                    System.out.print("\n");
                    System.out.print("Nhap so luong dien thoai: ");
                    m = sc.nextInt();
                    mobile = new Mobile[m];
                    for (int i = 0; i < m; i++) {
                        System.out.print("\n");
                        System.out.print("Nhap thong tin dien thoai " + (i + 1) + "\n");
                        mobile[i] = new Mobile();
                        mobile[i].input();
                    }
                    System.out.print("\n");
                    break;
                }
                case 2: {
                    int m;
                    System.out.print("Nhap so luong oto: ");
                    m = sc.nextInt();
                    car = new Car[m];
                    for (int i = 0; i < m; i++) {
                        System.out.print("\n");
                        System.out.print("Nhap thong tin oto " + (i + 1) + "\n");
                        car[i] = new Car();
                        car[i].input();
                    }
                    System.out.print("\n");
                    break;
                }
                case 3: {
                    if (mobile == null && car == null) {
                        System.out.print("ban chua nhap du lieu");
                    } 
                    else {
                        System.out.print("du lieu ban vua nhap la : \n");
                        if(mobile == null){
                            System.out.println("khong co thong tin dien thoai \n");
                        }
                        else {
                            for (int i = 0; i < mobile.length; i++) {
                                System.out.print("\n");
                                System.out.println("thong tin dien thoai " + (i + 1));
                                mobile[i].display();
                            }
                        }
                        if(car == null){
                            System.out.println("khong co thong tin oto \n");
                        }
                        else{
                            for (int i = 0; i < car.length; i++) {
                                System.out.print("\n");
                                System.out.println("thong tin oto " + (i + 1));
                                car[i].display();
                            }
                        }
                    }
                    System.out.print("\n");
                    break;
                }
                case 4: {
                    Scanner sc1 = new Scanner(System.in);
                    System.out.print("\n");
                    System.out.print("nhap ten nha san xuat:");
                    String engineName = sc1.nextLine();
                    int dem = 0;
                    System.out.print("thong tin nha san xuat ban muon tim la : \n\n");
                    if( mobile != null){
                        for (int i = 0; i < mobile.length; i++) {
                            if(mobile[i].getEngineName().equals(engineName)){
                                System.out.println("thong tin dien thoai " + (i + 1));
                                mobile[i].display();
                                System.out.print("\n");
                                dem++;
                            }
                        }
                   }
                    if(car != null){
                        for(int i = 0; i < car.length; i++){
                            if(car[i].getEngineName().equals(engineName)){
                                System.out.println("thong tin oto " + (i + 1));
                                car[i].display();
                                System.out.print("\n");
                                dem++;
                            }
                        }
                    }
                    if(dem == 0){
                        System.out.println("khong co nha san xuat ban muon tim");
                    }
                    break;
                }
            }
        } while(n != 0);
    }
}
