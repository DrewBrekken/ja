package Febuary;
/* Drew 2/8/21
learn to use scanner and if/else
*/
import java.util.*;
public class conditionalScanner {
    public static void main(String [] args){
        System.out.print("Please enter age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("You are "+ age +" years old");
    
    if( age >= 60){
        System.out.println("You will be vacinated");
    }
    else if(age > 40){
        System.out.println("You need to be tested!");
    }
    else{
        System.out.println("Don't worry about it.");
    }
}
}
