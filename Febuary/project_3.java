package Febuary;

public class project_3 {
    public static final int SIZE = 4;
    public static void main(String [] args) {
        dashline();
        Top();
        Bottom();
        dashline();
        Bottom();
        Top();
        dashline();
    }
    public static void dashline(){
        System.out.print("+");
        for(int dash = 1; dash <= 1+SIZE*2; dash++){
            System.out.print("=");
        }
        System.out.println("+");
    }
    public static void Top(){
        for(int line = 1; line <= SIZE; line++){
            System.out.print("|");
            for(int spaces = 1; spaces <= -1*line+5; spaces++){
                System.out.print(" ");
            }
            for(int fslash = 1; fslash <= line-1; fslash++){
                System.out.print("/");
            }
            System.out.print("*");
            for(int bslash = 1; bslash <= line-1; bslash++){
                System.out.print("\\");
            }
            for(int spaces = 1; spaces <= -1*line+5; spaces++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    public static void Bottom(){
        for(int line1 = 1; line1 <= SIZE; line1++) {
            System.out.print("|");
            for(int spaces = 1; spaces <= line1; spaces++) {
                System.out.print(" ");
            }
            for(int bslash = 1; bslash <= -1*line1+4; bslash++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for(int fslash = 1; fslash <= -1*line1+4; fslash++) {
                System.out.print("/");
            }
            for(int spaces = 1; spaces <= line1; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
