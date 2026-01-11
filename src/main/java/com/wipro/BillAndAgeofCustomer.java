package com.wipro;
import java.util.Scanner;
public class BillAndAgeofCustomer {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the bill amount");
        float bill=sc.nextFloat();
        float discount=0.0f;
        float netamount=0.0f;
        System.out.println("enter the age of the customer");
        int age=sc.nextInt();
        if (age>50){
            discount=bill*0.05f;
        }
        netamount=bill-discount;
        System.out.println("BillAmount:"+bill);
        System.out.println("Discount:"+discount);
        System.out.println("netamount:"+netamount);

    }
}
