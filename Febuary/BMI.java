package Febuary;
 import java.util.*;
public class BMI {
   /*
   start by importing the util Scanner
   ask for the inputs from the scanner
   using the inputs calculate the bmi
   print the bmi then run if/else statements that print if they are normal or obese and so on
   then print second bmi and run if/eles statements again
   */
public static void main(String [] args){
    System.out.println("Enter subject 1's weight(pounds): ");
    Scanner input = new Scanner(System.in);
    double w1 = input.nextDouble();
    System.out.println("Enter subject 1's height(in): ");
    Scanner input1 = new Scanner(System.in);
    double h1 = input1.nextDouble();
    System.out.println("Enter subject 2's weight(pounds): ");
    Scanner input2 = new Scanner(System.in);
    double w2 = input2.nextDouble();
    System.out.println("Enter subject 2's height(in): ");
    Scanner input3 = new Scanner(System.in);
    double h2 = input3.nextDouble();
    double bmi1 = (w1/(h1*h1)*703);
    double bmi2 = (w2/(h2*h2)*703);
    System.out.printf("Subject 1's BMI is %.3f\n", bmi1);
    if(bmi1 < 18.5){
        System.out.println("Subject 1 is underweight.");
    }
    else if(bmi1 >= 18.5 && bmi1 < 24.9){
        System.out.println("Subject 1's weight is normal.");
    }
    else if(bmi1 >= 24.9 && bmi1 < 29.9){
        System.out.println("Subject 1 is overweight.");
    }
    else{
        System.out.println("Subject 1 is obese.");
    }
    System.out.printf("Subject 2's BMI is %.3f\n", bmi2);
    if(bmi2 < 18.5){
        System.out.println("Subject 2 is underweight.");
    }
    else if(bmi2 >= 18.5 && bmi2 < 24.9){
        System.out.println("Subject 2's weight is normal.");
    }
    else if(bmi2 >= 24.9 && bmi2 < 29.9){
        System.out.println("Subject 2 is overweight.");
    }
    else{
        System.out.println("Subject 2 is obese.");
    }
}
    
}
