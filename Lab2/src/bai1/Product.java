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
public class Product {
    private String tenHangHoa;
    private String nhaSanXuat;
    private float giaBan;
    Scanner sc = new Scanner(System.in);

    public Product(){}
    public Product(String tenHangHoa, String nhaSanXuat, float giaBan) {
        this.tenHangHoa = tenHangHoa;
        this.nhaSanXuat = nhaSanXuat;
        this.giaBan = giaBan;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
    
    
    public void sort(Product[] b){
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i].giaBan > b[j].giaBan) {
                    Product tem = b[i];
                    b[i] = b[j];
                    b[j] = tem;
                }
            }
       }
    }
    

    public void nhap() {
        System.out.print("\nTen hang hoa:");
            this.tenHangHoa = sc.nextLine();
        System.out.print("\nNha san xuat:");
            this.nhaSanXuat = sc.nextLine();
        System.out.println("\nGia ban 1 san pham:");
            this.giaBan=sc.nextFloat(); 
    }
    public void hienthi() {
        System.out.print("\nTen hang hoa:" +  this.tenHangHoa);
        System.out.print("\nNha san xuat:" + this.nhaSanXuat);
        System.out.println("\nGia ban 1 san pham:" + this.giaBan);
    }
}
