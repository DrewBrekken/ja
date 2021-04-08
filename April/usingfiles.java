package April;
import java.io.*;
import java.util.*;
public class usingfiles {
    public static void main(String [] args) throws FileNotFoundException{
    File myfile = new File("C:\\Users\\brekk\\OneDrive - Greenhill School\\Documents\\JAVA2021\\April\\example.txt");
    Scanner input = new Scanner(myfile);
    while(input.hasNextLine()){
        System.out.println(input.nextLine());
    }
    }
}
