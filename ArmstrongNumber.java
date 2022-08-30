package com.zsgs2;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num,sum=0,temp,digit=0,rem;
        System.out.println("Enter a Number");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(temp>0){
            temp=temp/10;
            digit++;
        }
        temp=num;
        while(temp>0){
            rem=temp%10;
            sum+=Math.pow(rem,digit);
            temp=temp/10;
        }
        if(num==sum){
            System.out.println("Given number is armstrong number");
        }else{
            System.out.println("Given number is not armstrong");
        }
    }

}
