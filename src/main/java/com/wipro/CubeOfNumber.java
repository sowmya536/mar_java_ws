package com.wipro;
import java.util.Scanner;
public class CubeOfNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int b=a*a*a;
        System.out.println("The cube of entered number is :"+ b);
    }
}
