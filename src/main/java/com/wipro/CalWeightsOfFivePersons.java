package com.wipro;
import java.util.Scanner;
public class CalWeightsOfFivePersons {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight of first person");
        int w1=sc.nextInt();
        System.out.println("Enter the weight of second person");
        int w2=sc.nextInt();
        System.out.println("Enter the weight of third person");
        int w3=sc.nextInt();
        System.out.println("Enter the weight of fourth person");
        int w4=sc.nextInt();
        System.out.println("Enter the weight of fifth person");
        int w5=sc.nextInt();
       int netweight=w1+w2+w3+w4+w5;
       int avgweight=netweight/5;
        System.out.println("the net weight of five persons is :" +netweight);
        System.out.println("the avg weight of five persons is: "+avgweight);





    }
}
