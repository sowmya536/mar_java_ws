package com.wipro;
import java.util.Scanner;
public class FibonacciSeries {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int sum=0;
        int b=1;
        for (int i=1; i<=a;i++)
        {
            System.out.println(sum);
            int c=sum+b;
            sum=b;
            b=c;
        }

    }
}
