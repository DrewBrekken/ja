package April;
import java.io.*;
import java.util.*;
public class changeinTemp {
    public static void main(String [] args) throws FileNotFoundException{
    File myfile = new File("C:\\Users\\brekk\\OneDrive - Greenhill School\\Documents\\JAVA2021\\April\\example.txt");
    Scanner input = new Scanner(myfile);
    double change = 0;
    double temp1 = input.nextDouble();
    double temp2 = 0;
        while(input.hasNext()){
            if(input.hasNextDouble()){
            temp2 = input.nextDouble();    
            change = (temp2-temp1);
            System.out.printf("%.1f to %.1f , change = %.1f \n",temp1, temp2, change);
            temp1 = temp2;
            }
            else{
                String trash = input.next();
            } 
        }
    }
}

