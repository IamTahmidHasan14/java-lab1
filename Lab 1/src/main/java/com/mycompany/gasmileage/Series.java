package com.mycompany.gasmileage;

import java.util.Scanner;
public class Series {
    public static void main(String[] args) {
        int x = 0, term = 0, factorial = 1;
        double ex = 0.0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        term = sc.nextInt();
        for(int i = 0; i < term; i++){
            if(i == 0) ex += 1.0;
            for(int j = 1; j <= i+1; j++){
                factorial *= j;
            }
            ex += (Math.pow(x, i+1)/factorial);
            factorial = 1;
        }
        System.out.println("Result of Maclaurin Series: "+ex);
    }
}
