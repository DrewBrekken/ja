package April;
import java.io.*;
import java.util.*;
public class usingfiles {
    public static void main(String [] args) throws FileNotFoundException{
    File myfile = new File("C:\\Users\\brekk\\OneDrive - Greenhill School\\Documents\\JAVA2021\\April\\example.txt");
    Scanner input = new Scanner(myfile);
    while(input.hasNextLine()){
        Scanner line = new Scanner(input.nextLine());
        while(line.hasNext()){
            if(line.hasNextDouble()){
            System.out.println(line.nextDouble());
            } else{
                String temp = line.next();
            }
        }
        //System.out.println(input.nextLine());
    }
    }
}
