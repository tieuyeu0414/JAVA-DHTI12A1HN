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
public class Engine {
    String engineId;
    String engineName;
    String manufacturer;
    int yearMaking;
    float price;
    Scanner sc = new Scanner(System.in);

    public Engine() {
    }

    public Engine(String engineId, String engineName, String manufacturer, int yearMaking, float price) {
        this.engineId = engineId;
        this.engineName = engineName;
        this.manufacturer = manufacturer;
        this.yearMaking = yearMaking;
        this.price = price;
    }

    public String getEngineId() {
        return engineId;
    }

    public String getEngineName() {
        return engineName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearMaking() {
        return yearMaking;
    }

    public float getPrice() {
        return price;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYearMaking(int yearMaking) {
        this.yearMaking = yearMaking;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    public void input() {
        System.out.print("nhap ma may: ");
        this.engineId = sc.nextLine();
        System.out.print("nhap ten may: ");
        this.engineName = sc.nextLine();
        System.out.print("nhap ten nha san xuat: ");
        this.manufacturer = sc.nextLine();
        System.out.print("nhap nam san xuat: ");
        this.yearMaking = sc.nextInt();
        System.out.print("nhap gia ban: ");
        this.price = sc.nextFloat(); 
    }
    public void display() {
        System.out.print("ma may: " + engineId + "\n");
        System.out.print("ten may: " + engineName + "\n");
        System.out.print("ten nha san xuat: " + manufacturer + "\n");
        System.out.print("nam san xuat: " + yearMaking + "\n");
        System.out.print("gia ban: " + price + "\n");
    }
}
