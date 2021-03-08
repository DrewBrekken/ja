package March;
import java.util.*;
public class problem10 {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    int x, y;
    System.out.println("What is the first value? ");
    x = input.nextInt();
    System.out.println("What is the second value? ");
    y = input.nextInt();
    double avg = average(x, y);
    System.out.println(avg);
    }
    public static double average(int x, int y){
        return (x+y)/2.0;
    }
}
