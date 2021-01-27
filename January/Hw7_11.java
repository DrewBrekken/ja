package January;

public class Hw7_11 {
    public static final int SIZE=10;
    public static void main(String [] args) {
        dashes();
        repeatnumbers();
        }
        
    
    public static void dashes() {
        for(int dash = 1; dash <= 60/SIZE; dash++) {
        for(int space = 1; space <= SIZE-1; space++) {
            System.out.print(" ");
        }
        System.out.print("|");
    }  
    System.out.println("");
    }
    public static void repeatnumbers() {
        for(int thing = 1; thing <= SIZE; thing++){
            System.out.print("_-^-");
        }
        System.out.println("");
    }
    

}
