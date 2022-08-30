package com.zsgs2;
import java.util.Scanner;
public class PrintHappyNumber {
    public static void main(String[] args) {
        int limit,result;
        System.out.println("Enter limit");
        Scanner sc = new Scanner(System.in);
        limit = sc.nextInt();

        for (int i = 1; i <= limit; i++) {
            result=i;
            while (result!=1 && result!=4) {
                result = isHappyNum(result);
            }
            if(result==1)
                System.out.print(i + ", ");
        }
    }

    static int isHappyNum(int n) {
        int sum = 0, rem = 0;
        while (n > 0) {
            rem = n % 10;
            sum += (rem * rem);
            n = n / 10;
        }
return sum;
    }
}
