package com.zsgs2;

import java.util.Scanner;

public class Pronic_7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to check Pronic or not");
        int n = sc.nextInt();
        boolean pronic = false;
        for(int i=0;i<=n;i++){
            if((i+1)*i==n){
                pronic=true;
                break;
            }
        }
        if(pronic)
           System.out.println("Given number "+n+" is a pronic number");
        else
           System.out.println("Given number "+n+" is not a pronic number");

    }
}
