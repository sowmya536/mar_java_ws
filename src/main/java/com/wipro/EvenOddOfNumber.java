package com.wipro;
import java.util.Scanner;
public class EvenOddOfNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a =sc.nextInt();
        if (a%2==0)
        {
            System.out.println("The number is even" +a);
        }
        System.out.println("The number is odd" +a);
    }
}
