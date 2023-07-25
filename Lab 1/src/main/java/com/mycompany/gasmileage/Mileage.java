package com.mycompany.gasmileage;

import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) {
        int x, y, Trips = 0;
        float avgMileage, totalMileage = 0;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        while(x!=-1 && y!=-1) {
            float t = (float)x / y;
            System.out.printf("mileage = %f\n", t);
            totalMileage += t;
            ++Trips;
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        avgMileage = totalMileage / Trips;
        System.out.printf("\n");
        System.out.printf("total mileage = %f average mileage = %f\n", totalMileage, avgMileage);
    }
}
