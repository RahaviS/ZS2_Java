package com.zsgs2;

public class Pattern_4 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int spaces=n-i;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            int col=n-spaces;
            for(int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
