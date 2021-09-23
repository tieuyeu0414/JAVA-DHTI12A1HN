/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author hailo
 */
public class bai2 {
    public static void main(String[] args) {
    int a,b,c,max,min;
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap so nguyen a:");
    a = sc.nextInt();
    System.out.println("Nhap so nguyen b:");
    b = sc.nextInt();
    System.out.println("Nhap so nguyen c:");
    c = sc.nextInt();
    max = (a>b)?a:(b>c?b:c);
    min = (a>b)?b:(a>c?c:a);
    System.out.println("Max la:"+max);
    System.out.println("Min la:"+min);
    }
}
