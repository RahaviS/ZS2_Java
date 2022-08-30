package com.zsgs2;

public class EvenOddSumArray_14 {
    public static void main(String[] args) {
        int[] arr={15,96,65,28,74,23,46};
        int[] odd=new int[arr.length];
        int[] even=new int[arr.length];
        int oddIndex=0, evenIndex=0;
        int oddSum=0,evenSum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even[evenIndex]=arr[i];
                evenSum+=even[evenIndex];
                evenIndex++;
            }else{
                odd[oddIndex]=arr[i];
                oddSum+=odd[oddIndex];
                oddIndex++;
            }

        }
       System.out.println("Sum of Odd Numbers in Array is "+oddSum);
       System.out.println("Sum of Even Numbers in Array is "+evenSum);
    }
}
