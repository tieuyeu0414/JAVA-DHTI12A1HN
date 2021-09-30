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
public class ProductBai2 {
    String maHH;
    String tenHH;
    float soLuong;
    float gia1SP;
    Scanner sc = new Scanner(System.in);

    public ProductBai2() {
    }

    public ProductBai2(String maHH, String tenHH, float soLuong, float gia1SP) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.gia1SP = gia1SP;
    }

    public String getMaHH() {
        return maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public float getGia1SP() {
        return gia1SP;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public void setGia1SP(float gia1SP) {
        this.gia1SP = gia1SP;
    }
    
    public void input() {
        System.out.print("\nMa hang hoa:");
        this.maHH = sc.nextLine();
        System.out.print("\nTen hang hoa:");
        this.tenHH = sc.nextLine();
        System.out.print("\nSo luong:");
        this.soLuong = sc.nextFloat();
        System.out.println("\nGia ban 1 san pham:");
        this.gia1SP = sc.nextFloat(); 
    }
    public void display() {
        System.out.print("\nMa hang hoa:" + this.maHH);
        System.out.print("\nTen hang hoa:" + this.tenHH);
        System.out.print("\nSo luong:" + this.soLuong);
        System.out.println("\nGia ban 1 san pham:" + this.gia1SP);
    }
}
