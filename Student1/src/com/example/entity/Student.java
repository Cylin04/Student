package com.example.entity;
import java.util.Scanner;
public class Student {
    private int id;
    private String fistName;
    private String lastName;
    private double mark;

    public Student (int id, String fistName, String lastName, double mark){
        this.id = id ;
        this.fistName = fistName;
        this.lastName = lastName;
        this.mark = mark;

    }
    public void scanInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID: ");
        this.id = scanner.nextInt();
        System.out.println("Enter fist name: ");
        this.fistName = scanner.nextLine();
        System.out.println("Enter last name: ");
        this.lastName = scanner.nextLine();
        System.out.println("Enter mark: ");
        this.mark = scanner.nextDouble();
    }
    public void printInfo(){
        System.out.println("%3d|%10s%10s|55f\n");

    }
    public String getFistName(){
        return fistName;

    }
    public String getLastName(){
        return lastName;

    }
    public int getId(){
        return id;


    }
    public double getMark(){
        return mark ;

    }
}
