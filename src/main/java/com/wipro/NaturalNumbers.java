package com.wipro;
import java.util.Scanner;
public class NaturalNumbers {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a =sc.nextInt();
        int sum=0;
        for (int i=1; i<=a;i++)
        {
            System.out.println(i);
            sum=sum+i;

        }
        System.out.println("The number of "+a+" natural number is"+sum);
    }
}
