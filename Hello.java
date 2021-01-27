/*This is our fisrt program
Learning how to print using print and println
use Strings as well
\t make space 
\n sets next print to next line
\" means it will print whatever is after \
*/
public class Hello{
    public static void main(String [] args){
        System.out.println("Hello there");   //2 args in and out
        System.out.print("\"Drew\"");
        int chairs = 5;
        double price = 10;
        System.out.println("I have "+ chairs +" at "+ price +" $ ");
        System.out.println("I have "+ (chairs + price)+" $ ");
        print();
    }
    public static void print(){
        System.out.println("Hello Drew");
        System.out.println("Want free vBucks");
    }
}