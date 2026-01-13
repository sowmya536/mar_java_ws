package com.wipro;
import java.util.Scanner;
public class SumOfHarmonicNumbers {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        double sum=0.0;
        for(int i=1;i<a;i++)
        {
            sum=sum+(1.0/i);
        }
        System.out.println("The sum is :"+sum);
    }
}
