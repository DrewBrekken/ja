package April;
import java.util.*;
public class mastermind {
    private static int both = 0;
    /*
    Write a program that plays a variation of the game of Mastermind with a user. For example, the program can use
    pseudorandom numbers to generate a four-digit number. The user should be allowed to make guesses until she gets
    the number correct. Clues should be given to the user indicating how many digits of the guess are correct and in the
    correct place and how many digits are correct but in the wrong place.
    */
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int masterNum = (int)(Math.random()*9000)+1000;
        //System.out.println(masterNum);
        int[] guesses = new int[4];
        int[] Num = new int[4];
        int x = masterNum;
        int y;
        for(int i = 3; i >= 0 ; i--){
            y = x % 10;
            Num[i] = y;
            x /= 10;
        }
        //System.out.println(Arrays.toString(Num));
        Arrays.fill(guesses, 0);
        System.out.println(Arrays.toString(guesses));
        while(both < 4){
            for(int i = 0; i < 4; i++){
                System.out.print("Guess " + (i+1) + " ");
                guesses[i] = input.nextInt();
                }
            System.out.println(Arrays.toString(guesses));
            Check(guesses, Num, masterNum);
        }
        
    }
    public static void Check(int[] guesses, int[] Num, int masterNum){
        int rightNum = 0;
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++){
                if(guesses[i] == Num[j]){
                    rightNum += 1;
                }
            }
            if(guesses[i] == Num[i]){
                    both += 1;
                }
    }
    System.out.println(rightNum + " of the numbers are correct.");
    System.out.println(both + " of the correct numbers are in the right spot.");
   if(both == 4){
        System.out.println("Correct! You win! The number was " + masterNum);
     }else{
         both = 0;
     }
    }
}
