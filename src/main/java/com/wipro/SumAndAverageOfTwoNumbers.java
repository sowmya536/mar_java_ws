package com.wipro;

import java.util.Scanner;
public class SumAndAverageOfTwoNumbers {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a= sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int sum=a+b;
        int avg=sum/2;
        System.out.println("The sum is "+ sum);
        System.out.println("The avg is "+avg);
    }
}
