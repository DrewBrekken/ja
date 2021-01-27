public class Stars {
    public static void main(String [] args) {
        FOT();
    /*Fives();
    Fives();
    Twos();
    Ones();
    Twos();*/
    System.out.println("\n");
    FOT();
   /* Fives();
    Fives();
    Twos();
    Ones();
    Twos();*/
    Fives();
    Fives();
    System.out.println("\n");
    Ones();
    Ones();
    Ones();
    FOT();
   /* Fives();
    Fives();
    Twos();
    Ones();
    Twos();*/
    }
    public static void Ones() {
        System.out.println("  *");
    }
    public static void Twos() {
        System.out.println(" * *");
    }
    public static void Fives() {
        System.out.println("*****");
    }
    public static void FOT() {
        Fives();
        Fives();
        Twos();
        Ones();
        Twos();
    }
}
