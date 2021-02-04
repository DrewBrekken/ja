package Febuary;

public class project_4 {
    public static final int numstairs = 5;
    public static void main(String [] args) {
        for(int stairs = 1; stairs <= numstairs; stairs++){
            visualstairs(stairs);
        }
        System.out.print("**");
        for(int a = 1; a <= numstairs*6; a++){
            System.out.print("*");
        }
    }
    public static void spacesleft(int stairs) {
        for(int space = 1; space <= (5*numstairs-5)-(5*stairs-5); space++) {
            System.out.print(" ");
        }
    }
public static void endspace(int stairs){
    for(int space = 1; space <= 5*stairs; space++) {
        System.out.print(" ");
    }
    System.out.println("*");
}
    public static void visualstairs(int stairs){
        spacesleft(stairs);
        System.out.print("  O  ");
        System.out.print("******");
        for(int i = 1; i <= 5*stairs-5; i++){
            System.out.print(" ");
        }
        System.out.println("*");
        spacesleft(stairs);
        System.out.print(" /|\\ *");
        endspace(stairs);
        spacesleft(stairs);
        System.out.print(" / \\ *");
        endspace(stairs);
    }
    
}
