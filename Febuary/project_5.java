package Febuary;

public class project_5 {
    public static final int SIZE = 3;
    public static void main(String [] args){
        cone();
        symbols();
        M();
        W();
        symbols();
        W();
        M();
        cone();
    }
    public static void cone(){
        for(int line = 1; line <= 2+SIZE; line++){
            for(int spaces = 1; spaces <= -1*line+2*SIZE; spaces++){
                System.out.print(" ");
            }
            for(int fslash = 1; fslash <= line; fslash++){
                System.out.print("/");
            }
            System.out.print("**");
            for(int bslash = 1; bslash <= line; bslash++){
                System.out.print("\\"); 
            }
            System.out.println("");
        }
    }
    public static void symbols(){
        System.out.print("+");
        for(int equ = 1; equ <= 2*SIZE; equ++){
            System.out.print("=*");
        }
        System.out.println("+");
    }
    public static void dotm(int line){
        for(int dot = 1; dot <= -1*line+3; dot++){
            System.out.print(".");
        }
    }
    public static void cardsm(int line){
        for(int cards = 1; cards <= line; cards++){
            System.out.print("/\\");
        }
    }
    public static void M(){
        for(int line = 1; line <= SIZE; line++){
            System.out.print("|");
            dotm(line);
            cardsm(line);
            dotm(line);
            dotm(line);
            cardsm(line);
            dotm(line);
            System.out.println("|");
        }
    }
    public static void dotw(int linew){
        for(int dot = 1; dot <= linew-1; dot++){
            System.out.print(".");
        }
    }
    public static void cardsw(int linew){
        for(int cards = 1; cards <= -1*linew+4; cards++){
            System.out.print("\\/");
        }
    }
    public static void W(){
        for(int linew = 1; linew <= SIZE; linew++){
            System.out.print("|");
            dotw(linew);
            cardsw(linew);
            dotw(linew);
            dotw(linew);
            cardsw(linew);
            dotw(linew);
            System.out.println("|");
        }
    }
}
