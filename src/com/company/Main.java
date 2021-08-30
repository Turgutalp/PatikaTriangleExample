package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st side: ");
        int  a = sc.nextInt();

        System.out.println("Enter the 2st side: ");
        int b = sc.nextInt();

        System.out.println("Enter the 3rd side: ");
        int c = sc.nextInt();

        if((a+b) > c && (a+c) > b && (b+c) > a){
            int u = (a+b+c)/2 ;

            double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));

            System.out.println("Area of Triangle: " + area);
            System.out.println("Perimeter of Triangle: " + (2*u));
        }else{
            System.out.println("Undefined..");
        }


    }



}
