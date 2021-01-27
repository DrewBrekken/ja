package January;

public class class27 {
    public static final int SIZE=7;
    public static void main(String [] args) {
        for(int line = 1; line <= SIZE; line++) {
        stars(line);
        spaces(line);
        backslash(line);
        frontslash(line);
        spaces(line);
        stars(line);
        
        System.out.println("");
        }
    }
        
    
    public static void frontslash(int line) {
        for(int slash = 1; slash <= 2*line-2; slash++) {
            System.out.print("\\");
        }
       
    }
    public static void spaces(int line) {
        for(int thing = 1; thing <= line-1; thing++){
            System.out.print(" ");
        }
      
    }
    public static void stars(int line){
        for(int star = 1; star <= -1*line+SIZE; star++){
            System.out.print("*");
        }
    }
    public static void backslash(int line) {
        for(int i = 1; i <= -2*line+SIZE*2; i++) {
            System.out.print("/");
        }
       
    }

}
