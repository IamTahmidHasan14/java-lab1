package com.mycompany.gasmileage;

import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        double TotalRetailValue = 0.0;
        int ProductNum = 0, QuantitySold = 0;
        Scanner sc = new Scanner(System.in);
        while(ProductNum != -1 || QuantitySold != -1){
            ProductNum = sc.nextInt();
            QuantitySold = sc.nextInt();
            switch (ProductNum) {
                case 1:
                    TotalRetailValue += (2.98*QuantitySold);
                    break;
                case 2:
                    TotalRetailValue += (2.98*QuantitySold);
                    break;
                case 3:
                    TotalRetailValue += (4.5*QuantitySold);
                    break;
                case 4:
                    TotalRetailValue += (9.98*QuantitySold);
                    break;
                case 5:
                    TotalRetailValue += (6.87*QuantitySold);
                    break;
                default:
                    break;
            }
        }
        System.out.println("Total Retail Price: $"+TotalRetailValue);
    }
}