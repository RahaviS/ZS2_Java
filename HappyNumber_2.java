package com.zsgs2;

import java.util.Scanner;

public class HappyNumber_2 {
    public static void main(String[] args) {
        int num,temp;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        num= sc.nextInt();
        temp=num;
        while(temp!=1) {
            temp = isHappyNumber(temp);
        }
        if(temp==1){
            System.out.println("Given number is a Happy number");
        }else{
            System.out.println("Given number is not a Happy number");
        }
    }
    static int isHappyNumber(int n){
        int sum=0,rem;
        while(n>0){
            rem=n%10;
            sum+=(rem*rem);
            n=n/10;
        }
        return sum;
    }
}
