package com.zsgs2;

public class Pattern_5 {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;

        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j = j + 1;
            }
            int space = 1;
            while (space <= 2 * (n - i)) {
                System.out.print(" ");
                space = space + 1;
            }
                int p = i;
                j = 1;
                while (j <= i) {
                    System.out.print(p);
                    p = p - 1;
                    j = j + 1;
                }

                System.out.println();
                i = i + 1;
            }
        }
    }

