package com.zsgs2;

public class SplitIntoSubstring_16 {
    public static void main(String[] args) {
        String str="Process Finished with Exit Code";
        String[] arr=str.split(" ");
        for(String s:arr){
            System.out.println(s);
        }
    }
}
