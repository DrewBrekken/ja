package January;

public class Hw_15 {
    public static void main(String [] args){
        printDesign();
    }
    public static void printDesign(){
        for(int line = 1; line <= 5; line++){
            for(int fd = 1; fd <= -1*line+6; fd++){
                System.out.print("-");
}
    for(int num = 1; num <= 2*line-1; num++){
        System.out.print((line+line-1));
    }
    for(int fd = 1; fd <= -1*line+6; fd++){
        System.out.print("-");
    }
    System.out.println(" ");
        }
    }
}
