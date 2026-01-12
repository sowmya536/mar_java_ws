package com.wipro;
import java.util.Scanner;
public class BiggestNumbers {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a= sc.nextInt();
        System.out.println("Enter second number ");
        int b =sc.nextInt();
        if (a>b)
        {
            System.out.println("The first number is bigger :"+a);
        }
        System.out.println("The second number is bigger :"+b);
    }
}
