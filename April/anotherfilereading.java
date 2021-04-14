package April;
import java.io.*;
import java.util.*;
public class anotherfilereading {
    public static void main(String [] args) throws FileNotFoundException{
        File myfile = new File("C:\\Users\\brekk\\OneDrive - Greenhill School\\Documents\\JAVA2021\\April\\textfile.txt");
        Scanner input = new Scanner(myfile);
            while(input.hasNextLine()){
                Scanner line = new Scanner(input.nextLine());
                while(line.hasNext()){
                    if(line.hasNextDouble()){
                        String trash = line.next();
                    }else{
                        System.out.print(line.next());
                    }
                }
                System.out.println("");
            }
        }
    
}
