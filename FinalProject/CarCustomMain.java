import java.util.*;
public class CarCustomMain {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        // declaring and intiating new cars
        CarCustom car1 = new CarCustom(); // examples
        CarCustom car2 = new CarCustom("SUV","bLuE","SporT"); // examples
        System.out.println("How many cars do you want to customize? ");
        int SIZE = input.nextInt();
        CarCustom [] cars = new CarCustom[SIZE];
        for(int i = 0; i < SIZE; i++){
            System.out.println("Enter prefered car body out of (Sedan, SUV, Convertible)");
            String body = input.next();
            System.out.println("Enter prefered paint color out of (White, Red, Yellow, Blue)");
            String paint = input.next();
            System.out.println("Enter prefered engine kit out of (Stock, Premium, Sport)");
            String engine = input.next();
            cars[i] = new CarCustom(body, paint, engine);
        }
        // Prints the result of all of the cars
        for(int z = 0; z < SIZE; z++){
        System.out.println(cars[z].toString());
        }
        // asking if they want to make a change using a method
        Mod(cars);
        // asks if the customer wants to hear what their car will sound like and uses a do while so they can listen to multiple of the cars that they customized then 
        // exit when needed by inputing -1
        System.out.println("Do you want to hear what your car will sound like? Answer 1 for Yes and 0 for NO. ");
        int soundQues = input.nextInt();
        int y;
        if(soundQues == 1){
            do{
            System.out.println("What car do you want to hear? (if you don't want to hear another can input -1)");
            y = input.nextInt();
            // System.out.println(y); used these to test and find an error
            // System.out.println(cars[y-1].getEngine());
            if(y > 0){
            cars[y-1].getSound(cars[y-1].getEngine());
            }
            }while(y != -1);
        }
    }
    public static void Mod(CarCustom [] cars1){
        Scanner Modinput = new Scanner(System.in);
        int modNum;
        do{
        System.out.println("Do you want to make any changes to any of your cars? answer 1 for Yes or 0 for No");
        modNum = Modinput.nextInt();
        if(modNum > 0){
            System.out.println("What car do you want to modify? ");
            int CNM = Modinput.nextInt(); // CarNumberMod
            System.out.println("Do you want to modify the body? (1 - Yes) and (0 - No)");
            int CBM = Modinput.nextInt(); // CarBodyMod
            System.out.println("Do you want to modify the paint? (1 - Yes) and (0 - No)");
            int CPM = Modinput.nextInt(); // CarPaintMod
            System.out.println("Do you want to modify the engine? (1 - Yes) and (0 - No)");
            int CEM = Modinput.nextInt(); // CarEngineMod
            if(CBM == 1){
                System.out.println("What do you want to change your body to? (suv, sedan, convertible) ");
                String bodySet = Modinput.next();
                cars1[CNM-1].setBody(bodySet);
            }
            if(CPM == 1){
                System.out.println("What do you want to change your paint to? (blue, red, yellow, white) ");
                String paintSet = Modinput.next();
                cars1[CNM-1].setPaint(paintSet);
            }
            if(CEM == 1){
                System.out.println("What do you want to change your engine to? (stock, premium, sport) ");
                String engineSet = Modinput.next();
                cars1[CNM-1].setEngine(engineSet);
            }
            System.out.println(cars1[CNM-1].toString());
        }
        }while(modNum != 0);
    }
}