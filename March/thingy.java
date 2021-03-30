package March;
import java.util.*;
public class thingy {
    public static Scanner input = new Scanner(System.in); //create a static scanner
    public static void main(String [] args){
        Exc1(); // asks user for value that we need to find and prints if value is used more than once and what the index is.
    }
    public static void Exc1(){
        int[] num = {3, 56, 12, 98, 90, 54, 32, 12, 54, 32}; // our array
        System.out.println("What number would you like to find? ");
        int value = input.nextInt(); // the input
        int index = lastIndexOf(num, value); // gets our value
        if(index >= 0){ // prints output
            System.out.println("The index is " + index);
        } else{
            System.out.println("The value " + value + " is not in the array.");
        }
    }
    public static int lastIndexOf(int [] a, int value){
        for(int i = a.length - 1; i >= 0; i--){
            if(a[i] == value){
                return i;
            } 
        }
        return -1;
    }
}
