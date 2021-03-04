package March;
import java.util.*;
public class conditionalloopshw_14 {
   
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your word? ");
        String word = keyboard.nextLine();
        if (word.length()%2 == 0){
            evenword(word);
        }
        else{
            oddword(word);
        }
    }
    public static void evenword(String even){
        String temp = " ";
        for(int e=0; e < even.length(); e+=2){
            temp = temp + even.charAt(e+1) + even.charAt(e);
        }
        System.out.println(temp);
        //int x = word.length();
        //int y = 0;
        //int z = 
    }
    public static void oddword(String odd){
        int ll = odd.length()-1;
        String temp = " ";
        for(int o=0; o < odd.length()-1; o+=2){
            temp = temp + odd.charAt(o+1) + odd.charAt(o);
        }
        System.out.print(temp);
        System.out.println(odd.charAt(ll));
    }
    
}
