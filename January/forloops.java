package January;

public class forloops {
    public static final int SIZE=9;
    public static void main(String [] args) {
        for(int line = 1; line <= SIZE; line++ ) {
            frontdots(line);
            System.out.print(line);
            backdots(line);
            System.out.println();
        }
        
    }
    public static void frontdots(int line) {
        for(int dots = 1; dots <= -line+SIZE; dots++) {
            System.out.print(".");
        }
    }
    public static void backdots(int line) {
        for(int dots = 1; dots <= line-1; dots++){
            System.out.print(".");
        }
    }
}
