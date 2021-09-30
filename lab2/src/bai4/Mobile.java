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
public class Mobile extends Engine{
    String country;
    Scanner scmobile = new Scanner(System.in);

    public Mobile() {
    }

    public Mobile(String country) {
        this.country = country;
    }

    public Mobile(String country, String engineId, String engineName, String manufacturer, int yearMaking, float price) {
        super(engineId, engineName, manufacturer, yearMaking, price);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public void input() {
        super.input();
        System.out.print("nhap nuoc san xuat: ");
        this.country = scmobile.nextLine();
    }
    public void display() {
        super.display();
        System.out.print("nuoc san xuat: " + country + "\n");
    } 
}
