package com.wipro;
import java.util.Scanner;
public class FactorialOfNumber {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int a =sc.nextInt();
        int fact=1;
        for (int i=1; i<=a; i++)
        {
            fact=fact*i;
        }
        System.out.println("The fact of the number is "+ fact);
    }
}
