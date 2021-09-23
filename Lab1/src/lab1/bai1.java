/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
import java.util.Scanner;
/**
 *
 * @author hailo
 */
public class bai1 {
    public static void main(String[] args) {
        int a = 0;
        double d = 0;
        char ch = 0;
        String str = null;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Nhap mot so nguyen:");
            a = sc.nextInt(); 
            System.out.println("Nhap mot so double:");
            d = sc.nextDouble();
            System.out.println("Nhap mot ki tu:");
            sc.nextLine(); // ki tu ket thuc nhap se bi mat
            ch = sc.nextLine().charAt(0);
            System.out.println("Nhap mot chuoi:");
            str = sc.nextLine();
        }
        catch (Exception e){
            System.out.println("lỗi");
        }
        System.out.println("Du lieu vua nhap:");
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("ch="+ch);
        System.out.println("str="+str);       
        System.out.println("\nIn tren cung 1 dong:");
        System.out.println("a="+a+", d="+d+", ch="+ch+", str="+str);
    }
}
