package com.wipro;
import java.util.Scanner;
public class AsciiValues {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char ch=sc.next().charAt(0);
        int a=(int) ch;
        if (a>=65 &&a<=90)
        {
            System.out.println("The character is in upper case");

        }
        else if (a>= 97 && a<=122) {
            System.out.println("The character is a lower case");
        } else if (a>=48 && a<=50) {
            System.out.println("The character is a digit");
            
        } else {
            System.out.println("The character is a special Symbol");
        }
    }
}
