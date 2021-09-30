/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author hailo
 */
public class Book {
    private String bookName;
    private String bookAuthor;
    private String producer;
    private int yearPublishing;
    private float price;
    Scanner sc = new Scanner(System.in);


    public Book() {
    }

    public Book(String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.producer = producer;
        this.yearPublishing = yearPublishing;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getProducer() {
        return producer;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public float getPrice() {
        return price;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void input() {
        System.out.print("\n nhap book Name:");
        this.bookName = sc.nextLine();
        System.out.print("\n nhap book Author:");
        this.bookAuthor = sc.nextLine();
        System.out.print("\n nhap producer:");
        this.producer = sc.nextLine();
        System.out.print("\n nhap year Publishing:");
        this.yearPublishing = sc.nextInt();
        System.out.print("\n nhap price:");
        this.price = sc.nextFloat(); 
    }
    public void display() {
        System.out.print("\n book Name:" + this.bookName);
        System.out.print("\n book Author:" + this.bookAuthor);
        System.out.print("\n producer:" + this.producer);
        System.out.print("\n year Publishing:" + this.yearPublishing);
        System.out.print("\n price:" + this.price);
    }
}
