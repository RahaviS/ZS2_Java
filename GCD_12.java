package com.zsgs2;
import java.util.Scanner;
import java.lang.Math;
public class GCD_12 {
   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int min = Math.min(a,b);
        int max=Math.max(a,b);
        int arrayIndex=0,i=1;
        int factors[]= new int[min];
        while(i <= min){
            if(min % i == 0){
                factors[arrayIndex] = i;
                arrayIndex ++;
            }
            i++;
        }
     for(int j=0;j<factors.length;j++){
         for(int k=0;k<factors.length;k++){
             if(factors[j]>factors[k]){
                 int temp=factors[j];
                 factors[j]=factors[k];
                 factors[k]=temp;
             }
         }
     }
    for(int j=0;j<factors.length;j++){
        if(factors[j]!=0&&max%factors[j]==0){
            System.out.println("GCD of "+a+" and "+b+" is "+factors[j]);
        }
    }

       //Simple Method
//       for(int i=1;i<=a && i<=b;i++){
//           if(a%i==0 && b%i==0){
//               System.out.print("GCD is "+i);
//           }
//       }
}




}
