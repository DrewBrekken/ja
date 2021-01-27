public class Doublerocket {
    public static void main(String [] args) {
        TOP();
        BOX();
        US();
        BOX();
        TOP();
    }
    public static void TOP() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
       }   
       public static void BOX() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
       }
       public static void US() {
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
       }
}
