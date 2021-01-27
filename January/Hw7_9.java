package January;

public class Hw7_9 {
    public static final int SIZE=10;
    public static void main(String [] args) {
        topline();
        printweird();
        drnumbers();
        topline();
        }
        
    
    public static void topline() {
        for(int dash = 1; dash <= 4*SIZE; dash++) {
            System.out.print("-");
        }
        System.out.println("");
    }
    public static void printweird() {
        for(int thing = 1; thing <= SIZE; thing++){
            System.out.print("_-^-");
        }
        System.out.println("");
    }
    public static void drnumbers() {
        for(int i = 1; i <= 20; i++) {
            System.out.print(i%10);
            System.out.print(i%10);
        }
        System.out.println("");
    }

}
