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
public class UnetiBook  extends Book {
    private String language;
    private int semester;
    Scanner sc = new Scanner(System.in);

    public UnetiBook() {
    }

    public UnetiBook(String language, int semester) {
        this.language = language;
        this.semester = semester;
    }

    public String getLanguage() {
        return language;
    }

    public int getSemester() {
        return semester;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
     public void input() {
        super.input();
        System.out.print("\n nhap language:");
        this.language = sc.nextLine();
        System.out.print("\n nhap semester:");
        this.semester = sc.nextInt();
    }
    public void display() {
        super.display();
        System.out.print("\n language:" + this.language);
        System.out.print("\n semester" + this.semester);

    }
}
