package com.wipro;
import java.util.Scanner;
public class SwapOfTwoNumbers {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a= sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("The value of first number is "+a);
        System.out.println("The value of second number is :"+b);

    }
}
