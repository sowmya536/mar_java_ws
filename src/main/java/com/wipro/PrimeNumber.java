package com.wipro;
import java.util.Scanner;
public class PrimeNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a =sc.nextInt();
        int count=0;
        for (int i=1; i<=a;i++)
        {
            if(a%i==0)
            {
                System.out.print(i + " ");
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(a+"Is a prime number");
        }
        else {
            System.out.println(a+"Is not a prime number");
        }

    }
}
