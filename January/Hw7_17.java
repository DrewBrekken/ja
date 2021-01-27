package January;

public class Hw7_17 {
    public static final int SIZE=4;
    public static void main(String [] args) {
        for(int line = 1; line <= SIZE; line++) {
        frontslash(line);
        exclamation(line);
        backslash(line);
        
        System.out.println("");
        }
    }
        
    
    public static void frontslash(int line) {
        for(int slash = 1; slash <= 2*line-2; slash++) {
            System.out.print("\\");
        }
       
    }
    public static void exclamation(int line) {
        for(int thing = 1; thing <= -4*line+34; thing++){
            System.out.print("!");
        }
      
    }
    public static void backslash(int line) {
        for(int i = 1; i <= 2*line-2; i++) {
            System.out.print("/");
        }
       
    }

}
