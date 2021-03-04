package Febuary;
import java.util.*;
public class Chapter5_3 {
    //Write a method called toBinary that accepts an integer as a parameter and returns a String containing that
//integer’s binary representation. For example, the call of printBinary(44) should return "101100".
public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.println("What is the number you want to convert to Binary? ");
    int number = input.nextInt();
    convertToBinary(number);
}
public static void convertToBinary(int num){
    int bin=0;
    int factor=1;
    while(num!=1){
        int temp = num%2 * factor;
        num = num /2;
        bin = bin + temp;
        factor *=10;
        System.out.println(num);
    }
    System.out.println(bin);
}
}
