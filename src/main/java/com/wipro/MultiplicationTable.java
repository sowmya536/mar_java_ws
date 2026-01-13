package com.wipro;
import java.util.Scanner;
public class MultiplicationTable {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int a= sc.nextInt();
        System.out.println("The multiplication of a number"+a);
        for (int i=0; i<=10;i++)
        {
            int b= a*i;
            System.out.println(a +"*"+ i+ "=" +b);
        }
    }
}
