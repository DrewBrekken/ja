package April;
import java.io.*;
import java.util.*;
public class calculatingWorkHours {
    public static void main(String [] args) throws FileNotFoundException{
        File myfile = new File("C:\\Users\\brekk\\OneDrive - Greenhill School\\Documents\\JAVA2021\\April\\work_hours.txt");
        Scanner input = new Scanner(myfile);
        File hoursFile = new File("hoursFile.txt");
        PrintStream output = new PrintStream("hoursFile.txt");
        int IDNum = 0;
        String name = "";
        int day = 0;
        double sum = 0;
            while(input.hasNextLine()){
                Scanner line = new Scanner(input.nextLine());    
                if(line.hasNextInt()){
                IDNum = line.nextInt();    
                }
                if(line.hasNext()){
                    name = line.next();
                }
                while(line.hasNextDouble()){
                if(line.hasNextDouble()){
                    sum += line.nextDouble();
                    day += 1;
                }
            }
                double avg = sum/day;
                System.out.printf(name + " (ID: " + IDNum + ") worked %.1f hours (%.1f hours per day.)\n", sum, avg);
                output.printf(name + " (ID: " + IDNum + ") worked %.1f hours (%.1f hours per day.)\n", sum, avg);
                sum = 0;
                day = 0;
            }
            input.close();            
        }
}
