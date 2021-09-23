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
public class bai4 {
    public static void main(String[] args) {
        int tiendien = 0, sodien;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien:");
        sodien = sc.nextInt();
        if(sodien <= 50){
            tiendien = sodien*5000;
        }
        else{
            int sodienthua = (sodien - 50)*6200;
            tiendien = (sodienthua + 50*5000);
        } 
        
        System.out.println("So dien la: " + tiendien);
    }
}
