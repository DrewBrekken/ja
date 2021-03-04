package Febuary;
import java.util.Random;
public class wednesday {
    public static void main(String [] args){
        String name1 = "Percent";
        String name2 = "Drew"; //name is a String object
        System.out.println(name1.charAt(3));
        int index = name2.indexOf("e");
        System.out.println(index);
        String temp = name1.substring(index+1);
        System.out.println(temp);
        int tempIdx = temp.indexOf("e")+1;
        tempIdx = tempIdx+index;
        System.out.println(tempIdx);
/* Math now
        int num = 31;
        double result = Math.sqrt(num);
        System.out.printf("The answer is %.2f", result);
        int randomnum = (int)(Math.random()*10000);
        System.out.println(randomnum);
        Random randy = new Random();
        int num1 = randy.nextInt(5);
        System.out.println(num1);
    
    */
    }
}
