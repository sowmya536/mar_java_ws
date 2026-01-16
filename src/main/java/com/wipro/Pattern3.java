package com.wipro;

public class Pattern3 {
    static void main() {
        for (int i=1;i<=5;i++)
        {
            for (int j=1; j<=i+(i-1);j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
