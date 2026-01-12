package com.wipro;
import java.util.Scanner;
public class ProfitAndLoss {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the cost price");
        double cost_price=sc.nextDouble();
        System.out.println("Enter the selling price");
        double selling_price= sc.nextDouble();
        double quantum;

        if(selling_price>cost_price)
        {
            quantum= cost_price-selling_price;
            System.out.println("The profit is :"+quantum);
        } else if (selling_price<cost_price) {
            quantum= cost_price-selling_price;
            System.out.println("The loss is :" +quantum);


        }
        else {
            System.out.println("No Profit, No loss");
        }

    }
}
