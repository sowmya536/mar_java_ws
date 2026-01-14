package com.wipro;
import java.util.Scanner;
public class SumOfOddNumbers {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int sum=0;
        for (int i=0; i<=a;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }
        System.out.println("The sum of odd number is"+sum);
    }
}
