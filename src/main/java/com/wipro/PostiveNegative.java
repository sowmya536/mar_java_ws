package com.wipro;
import java.util.Scanner;
public class PostiveNegative {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int a =sc.nextInt();
        if(a<0)
        {
            a=-a;

        }
        System.out.println(" the number is :"+a);
    }
}
