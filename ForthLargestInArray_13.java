package com.zsgs2;

public class ForthLargestInArray_13 {
    public static void main(String[] args) {
        int arr[] = {25, 36, 17, 45, 89, 12, 66};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nFourth Largest Element in this Array "+arr[3]);
            }
}
