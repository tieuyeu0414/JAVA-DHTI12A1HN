/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;
import java.util.Scanner;

/**
 *
 * @author hailo
 */
public class bai5 {
     public static void main(String[] args) {
        int n = 0, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Nhap vao so nguyen duong n");
        System.out.println("2.Tinh tong :1+....+1/n");
        System.out.println("3.Tinh tong :1+....+1/n!");
        System.out.println("0.Thoat");
        do{
            System.out.println("Nhap m:");
            m = sc.nextInt();
            switch (m) {
                case 1: {
                    System.out.println("Nhap n:");
                    n = sc.nextInt();
                    break;
                }
                case 2: {
                    if(n==0){
                        System.out.println("ban chua nhap n!hoac ban de n =0");
                    }
                    else{
                        float tong1=0;
                        for (int i = 1; i <= n; i++) {
                            tong1+=1.0/i;
                        }

                        System.out.println("Tong 1+...1/"+n+" la: " + tong1 );
                        break;
                    }
                }
                case 3: {
                    if(n==0){
                        System.out.println("ban chua nhap n!hoac ban de n =0");
                    }
                    else{
                        float tong2=0;
                        int giaithua=1;
                        for (int i = 1; i <= n; i++) {
                            giaithua*=i;
                            tong2+=1.0/giaithua;
                        }
                        System.out.println("Tong 1+...1/"+n+"! la: "+tong2);
                        break;
                    }
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Khong co lua chon cua ban ");
                    break;
                }
            }
        }
        while(m!=0)
    }
}
