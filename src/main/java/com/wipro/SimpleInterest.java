package com.wipro;

import java.util.Scanner;

public class SimpleInterest {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of principal");
        int p= sc.nextInt();
        System.out.println("Enter the rate of interest");
        int r=sc.nextInt();
        System.out.println("Enter the time value");
        int t= sc.nextInt();
        int si=(p*t*r)/100;
        System.out.println("The simple interest is :"+si);

    }
}
