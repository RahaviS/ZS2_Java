package com.zsgs2;

import java.util.Scanner;

public class Palindrome_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while (num > 0) {
            rev=rev*10+(num%10);
            num=num/10;
        }

        if(temp==rev){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
