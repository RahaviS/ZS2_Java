package com.zsgs2;

import java.util.Scanner;

public class PrintPronic_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print pronic number upto that");
        int n = sc.nextInt();
        System.out.println("Pronic Numbers upto n");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j * (j + 1) == i) {
                    System.out.print(i + " ");
                }
            }
        }
        //To print Prime numbers upto n
        System.out.println("\nPrime Numbers upto n");

        for (int i = 2; i <= n; i++) {
            boolean flag=true;
            for (int j = 2; j<i; j++) {
                if (i % j == 0)
                    flag = false;
            }
            if(flag)
                System.out.print(i+" ");
        }
    }
}
