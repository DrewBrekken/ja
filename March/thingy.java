package March;
import java.util.*;
public class thingy {
    private static int count = 0;
    private static String word;
    public static Scanner input = new Scanner(System.in); //create a static scanner
    public static void main(String [] args){
        //Exc1(); // asks user for value that we need to find and prints if value is used more than once and what the index is.
        //Exc5();
        //Exc16();
        //Exc17();
        Pro2();
    }
    public static void Pro2(){
        /*
Write a game of Hangman using arrays. Allow the user to guess letters and represent which letters have been
guessed in an array
        */
        System.out.println("The category is fruits. ");
        String[] fruits = {"apple", "pear", "orange", "cherry", "watermelon", "papaya", "blueberry", "peach", "banana", "kiwi", "lemon", "lime", "pineapple", "plum"};
        Random rand = new Random();
        int random = rand.nextInt(13);
        word = fruits[random];
        int length = word.length();
        char[] guess = new char[length];
        char[] letters = word.toCharArray();
        Arrays.fill(guess, '_');
        System.out.println(Arrays.toString(guess));
        while(count < 5 && new String(guess).contains("_")){
            System.out.println("Guess a letter? ");
            System.out.println(Arrays.toString(guess));
            char send = input.next().charAt(0);
            Check(send, guess, letters, length);
        }
        
    }
    public static void Check(char send, char[] guess, char[] letters, int length){
        char[] bruh = new char[length];
        Arrays.fill(bruh, '_');
        boolean test = false;
        for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == send) {
				guess[i] = send;
                test = true;
			}
    }
    if (test == false){
        count++;
        hangmanImage();
    } 
    if (Arrays.equals(guess, letters)) {
        System.out.println("Correct! You win! The word was " + word);
    }
}
    public static void hangmanImage(){
        if(count == 1){
            System.out.println(" 0 ");
        }else if(count == 2){
            System.out.println(" 0 ");
            System.out.println(" | ");
        }else if(count == 3){
            System.out.println(" 0 ");
            System.out.println(" | ");
            System.out.println("/ \\");
        }else if(count == 4){
            System.out.println(" 0 ");
            System.out.println("\\| ");
            System.out.println("/ \\");
        }else if(count == 5){
            System.out.println(" 0 ");
            System.out.println("\\|/");
            System.out.println("/|\\");
            System.out.println("Sorry but you lose! The word was " + word);
        }
    }
    
    public static void Exc17(){
/*
Write a method called vowelCount that accepts a String as a parameter and produces and returns 
an array of integers representing the counts of each vowel in the string. The array returned by 
your method should hold five elements: the first is the count of As, the second is the count of 
Es, the third Is, the fourth Os, and the fifth Us. Assume that the string contains no uppercase 
letters. For example, the call vowelCount("i think, therefore i am") should return the array 
 0, 1, 2, 3, 4     a  e  i  o  u
{1, 3, 3, 1, 0}.
*/
int[] vowels = new int[5];
Scanner input = new Scanner(System.in);
System.out.println("Give me a sentence please ");
String phrase = input.nextLine();
vowels = vowelCount(phrase);
System.out.println(Arrays.toString(vowels));
input.close();
    }   
    public static int[] vowelCount(String phrase){
        int[] vowels = new int[5];
           char temp;
            for(int i = 0; i < phrase.length(); i++){
                temp = phrase.charAt(i);
            if(temp == 'a'){
                vowels[0] += 1;
            }
            if(temp == 'e'){
               vowels[1] += 1; 
            }
            if(temp == 'i'){
                vowels[2] += 1; 
            }
            if(temp == 'o'){
                vowels[3] += 1; 
            }
            if(temp == 'u'){
                vowels[4] += 1; 
            }
        }
        
        return vowels;
    }
    public static void Exc16(){
    /*
    Write a method called append that accepts two integer arrays as parameters and returns a new
    array that contains the result of appending the second array’s values at the end of the first
    array. For example, if arrays list1 and list2 store {2, 4, 6} and {1, 2, 3, 4, 5} 
    respectively, the call of append(list1, list2) should return a new array containing 
    {2, 4, 6, 1, 2, 3, 4, 5}. If the call instead had been append(list2, list1), the method 
    would return an array containing {1, 2, 3, 4, 5, 2, 4, 6}.
    */
    int[] list1 = {2, 4, 6};
    int[] list2 = {1, 2, 3, 4, 5};
    int newSize = list1.length + list2.length;
    int[] newList = new int[newSize];
    newList = append(list1, list2, newSize);
    }
    public static int[] append(int[] list1, int[] list2, int size){
        int[] newList = new int[size];
        //Arrays.fill(newList, 0);
        newList = Arrays.copyOf(list1, size);
        for(int i = list1.length; i < size; i++){
        newList[i] = list2[i-list1.length];
        }
        System.out.println(Arrays.toString(newList));
        return newList;
    }
    public static void Exc5(){
        /*
        Write a method called mode that returns the most frequently occurring element of an array of integers. Assume that
        the array has at least one element and that every element in the array has a value between 0 and 100 inclusive. Break
        ties by choosing the lower value. For example, if the array passed contains the values {27, 15, 15, 11, 27}, your
        method should return 15. (Hint: You may wish to look at the Tally program from this chapter to get an idea how to
        solve this problem.) Can you write a version of this method that does not rely on the values being between 0 and 100?
        */
        int[] num = {3, 56, 12, 98, 90, 54, 32, 12, 54, 32}; // our array
        int mode = modeFind(num);

    }
    public static int modeFind(int[] a){
        int[] tally = new int[101];
        Arrays.fill(tally, 0);
        for(int i = 0; i < a.length; i++){
            tally[a[i]] += 1;
        }
        int max = 0;
        for(int b = 0; b < tally.length; b++){
            if(tally[b] > max){
                max += 1;
                
            }
        }
        int j = 0; 
        While(tally[j] != max){
            j++;
        }
        return j;
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
