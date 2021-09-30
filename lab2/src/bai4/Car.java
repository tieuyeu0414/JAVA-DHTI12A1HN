/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author hailo
 */
public class Car extends Engine{
    int totalSeat;
    float speed;

    public Car() {
    }

    public Car(int totalSeat, float speed) {
        this.totalSeat = totalSeat;
        this.speed = speed;
    }

    public Car(int totalSeat, float speed, String engineId, String engineName, String manufacturer, int yearMaking, float price) {
        super(engineId, engineName, manufacturer, yearMaking, price);
        this.totalSeat = totalSeat;
        this.speed = speed;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public float getSpeed() {
        return speed;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
    public void input() {
        super.input();
        System.out.print("nhap so cho ngoi: ");
        this.totalSeat = sc.nextInt();
        System.out.print("nhap toc do: ");
        this.speed = sc.nextFloat();
    }
    public void display() {
        super.display();
        System.out.print("so cho ngoi: " + totalSeat + "\n");
        System.out.print("toc do: " + speed + "\n");
    } 
}
