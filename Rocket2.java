public class Rocket2{
    public static void main(String [] args){     //2 args  in  and out

             TOP();
             VSHAPE();
             System.out.println();
             VSHAPE();
             TOP();
             System.out.println();
             TOP();
             BOX();
             System.out.println("|United|");
             System.out.println("|States|");
             BOX();
             TOP();
             }
       public static void TOP() {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
       }   
       public static void VSHAPE() {
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
       }  
       public static void BOX() {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
       }
}
