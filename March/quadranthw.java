package March;
import java.util.*;
public class quadranthw {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    int x, y;
    String Quad;
    System.out.println("What is the x value? ");
    x = input.nextInt();
    System.out.println("What is the y value? ");
    y = input.nextInt();
    Quad = quadrant(x, y);
    System.out.println(Quad);
    }
    public static String quadrant(int x, int y){
        if(x>0 && y>0){
        return "Quadrant 1";
        } else if(x<0 && y>0){
            return "Quadrant 2";
        }else if(x<0 && y<0){
            return "Quadrant 3";
        }else{
            return "Quadrant 4";
        }
    }
}
