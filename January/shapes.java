package January;

public class shapes {
    
    public static void main(String [] args){
       dashline();
       Top();
       Bottom();
       dashline(); 
    }
    public static void dashline(){
       System.out.print("#");
       for(int equal = 1; equal <= 4*4; equal++){
        System.out.print("=");
       }
       System.out.println("#");
    }
    public static void Top(){
        for(int line = 1; line <= 4; line++) {
    System.out.print("|");
    spacetop(line);
    System.out.print("<>");
    for(int dots = 1; dots <= 4*line-4; dots++){
        System.out.print(".");
    }
    System.out.print("<>");
    spacetop(line);
    System.out.println("|");
}
    }
    
    public static void spacetop(int line) {
        for(int fspace = 1; fspace <= -2*line+8; fspace++) {
            System.out.print(" ");
        }
    }
    public static void Bottom(){
    for(int line1 = 1; line1 <= 4; line1++) {
        System.out.print("|");
        spacebottom(line1);
        System.out.print("<>");
        for(int dot = 1; dot <= -4*line1+16; dot++){
            System.out.print(".");
        }
        System.out.print("<>");
        spacebottom(line1);
        System.out.println("|");
    }
    }
    public static void spacebottom(int line1) {
        for(int bspace = 1; bspace <= 2*line1-2; bspace++) {
            System.out.print(" ");
        }
    }
}
