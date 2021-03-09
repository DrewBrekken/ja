package March;
import java.util.*;
public class guessingproject {
    public static void main(String [] args){
    int x;
    Random random = new Random();
    int z = random.nextInt(100);
    int t = 0;
    int y = 1;
    while(y == 1){
    Scanner input = new Scanner(System.in);
    System.out.println("What is your guess between 0-99? ");
    x = input.nextInt();
        if(x == z){
            System.out.println("Your guess was correct! ");
            System.out.println("It took you "+ t + " guesses");
            y = y+1;
        } else if (x > z){
            System.out.println(x +" is HIGHER than my number!");
            t = t+1;
        } else {
            System.out.println(x +" is LOWER than my number!");
            t = t+1;
        }
    }
    }
}
