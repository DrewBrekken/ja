package January;

public class Hw7_9 {
    public static final int SIZE=5;
    public static void main(String [] args) {
        for(int line = 1; line <= SIZE; line++ ) {
            frontspace(line);
            System.out.print(line);
            backspace(line);
            System.out.println();
        }
        
    }
    public static void frontspace(int line) {
        for(int space = 1; space <= -line+SIZE; space++) {
            System.out.print(" ");
        }
    }
    public static void backspace(int line) {
        for(int space = 1; space <= line-1; space++){
            System.out.print(" ");
        }
    }

}
