package com.zsgs2;
import java.util.Scanner;
public class BMI_20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Weight in KG");
        double weight = sc.nextDouble();
        System.out.println("Enter Height in metres");
        double height = sc.nextDouble();
        double bmi=calculateBmi(weight,height);
        System.out.format("Calculated BMI is %.2f ",bmi);
    }
    static double calculateBmi(double w,double h){
        return (w/(h*h));
    }
}
