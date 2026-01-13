package com.wipro;
import java.util.Scanner;
public class SumOfEvenAndOdd {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a =sc.nextInt();
        int esum=0;
        int osum=0;
        for (int i=0; i<=a; i++)
        {
            if(i%2==0)
            {
                esum=esum+i;
            }
            else
            {
                osum=osum+i;
            }
        }
        System.out.println("the sum of even numbers is :"+ esum);
        System.out.println("The sum of odd number is :" +osum);
    }
}
