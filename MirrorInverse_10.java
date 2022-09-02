package com.zsgs2;

import java.util.Scanner;

public class MirrorInverse_10 {
    public static void main(String[] args) {
        int arr[]={3,4,2,0,1};
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
           if(arr[arr[i]] != i){
               flag=false;
               break;
           }else
               flag=true;
        }
        if(flag)
        System.out.println("Given array is Mirror Inverse");
        else
            System.out.println("Given array is not Mirror Inverse");
    }
}
