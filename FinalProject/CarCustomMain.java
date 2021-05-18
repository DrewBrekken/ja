import java.util.*;
import java.io.*;
public class CarCustomMain {
    public static void main(String [] args) throws FileNotFoundException{
        File carPrices = new File("C:\\Users\\brekk\\OneDrive - Greenhill School\\Documents\\JAVA2021\\FinalProject\\CarPrices.txt");
        Scanner reader = new Scanner(carPrices); // this is the scanner that reads the entire file
        int SedanPrice = 0; // these are all initialized variables for the prices of the car parts
        int SuvPrice = 0; 
        int ConvertiblePrice = 0; 
        int StockPrice = 0;
        int PremiumPrice = 0; 
        int SportPrice = 0;
        while(reader.hasNextLine()){ // this while part is so it doesn't read the file in an infinite loop
            Scanner line = new Scanner(reader.nextLine());
            while(line.hasNext()){
                String type = line.next();
                int price = line.nextInt();
                if(type.equalsIgnoreCase("Sedan")){ // these if elses set the prices of said parts based off of the file
                    SedanPrice = price;
                }else if(type.equalsIgnoreCase("Suv")){
                    SuvPrice = price;
                }else if(type.equalsIgnoreCase("Convertible")){
                    ConvertiblePrice = price;
                }else if(type.equalsIgnoreCase("Stock")){
                    StockPrice = price;
                }else if(type.equalsIgnoreCase("Premium")){
                    PremiumPrice = price;
                }else{
                    SportPrice = price;
                }
            }
        }
        //System.out.println(SedanPrice + ", " + SuvPrice + ", " + ConvertiblePrice + ", " + StockPrice + ", " + PremiumPrice + ", " + SportPrice); // just a test part
        Scanner input = new Scanner(System.in);
        // declaring and intiating new cars
        CarCustom car1 = new CarCustom(); // examples
        CarCustom car2 = new CarCustom("SUV","bLuE","SporT"); // examples
        System.out.println("How many cars do you want to customize? "); // first question asking about how many custom cars they want to make
        int SIZE = input.nextInt(); // reads input and creates an array with the correct number of cars
        CarCustom [] cars = new CarCustom[SIZE];
        for(int i = 0; i < SIZE; i++){ // loop that lets the user create all of the custom parts of all of the cars they wanted to customize
            System.out.println("Enter prefered car body out of (Sedan, SUV, Convertible)");
            String body = input.next();
            System.out.println("Enter prefered paint color out of (White, Red, Yellow, Blue)");
            String paint = input.next();
            System.out.println("Enter prefered engine kit out of (Stock, Premium, Sport)");
            String engine = input.next();
            cars[i] = new CarCustom(body, paint, engine);
        }
        // Prints the result of all of the cars
        for(int z = 0; z < SIZE; z++){ // prints all of the cars using my object class 
        System.out.println(cars[z].toString());
        }
        Price(cars, SedanPrice, SuvPrice, ConvertiblePrice, StockPrice, PremiumPrice, SportPrice);
        Mod(cars); // asking if they want to make a change using a method

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
            }while(y != -1); // this is the code to exit if they don't want to listen to more cars
        }
        Price(cars, SedanPrice, SuvPrice, ConvertiblePrice, StockPrice, PremiumPrice, SportPrice); // letting them price it again after modding or hearing the car
        Mod(cars); // asking if they want to make a change using a method
    }
    public static void Price(CarCustom [] cars2, int SedanPrice1, int SuvPrice1, int ConvertiblePrice1, int StockPrice1, int PremiumPrice1, int SportPrice1){
        Scanner input1 = new Scanner(System.in); // new scanner and above the array of cars and the prices of parts are sent
        System.out.println("Do you want to get the price of a car? Answer 1 for Yes and 0 for NO. ");
        int CarPrice = input1.nextInt();
        int a;
        if(CarPrice == 1){
            do{ // do while if they input values other than -1
            System.out.println("What car do you want to get the price of? (if you don't want to get another input -1)");
            a = input1.nextInt();
            //System.out.println(cars2[a-1].getEngine()); used to test
            if(a > 0){
            String CarBodyPrice = cars2[a-1].getBody(); // to get the engine and body
            String CarEnginePrice = cars2[a-1].getEngine();
            //System.out.println(CarBodyPrice); used to test
            //System.out.println(CarEnginePrice);
            int BodyPrice = 0; // initializing the price that I will print
            int EnginePrice = 0;
            if(CarBodyPrice.equalsIgnoreCase("Sedan")){ // checking what body or engine that car has and setting the prices that I need to print based off of numbers from file
                BodyPrice = SedanPrice1;
            }else if(CarBodyPrice.equalsIgnoreCase("Suv")){
                BodyPrice = SuvPrice1;
            }else if(CarBodyPrice.equalsIgnoreCase("Convertible")){
                BodyPrice = ConvertiblePrice1;
            }
            if(CarEnginePrice.equalsIgnoreCase("Stock")){
                EnginePrice = StockPrice1;
            }else if(CarEnginePrice.equalsIgnoreCase("Premium")){
                EnginePrice = PremiumPrice1;
            }else{
                EnginePrice = SportPrice1;
            }
            System.out.println("The body will cost $" + BodyPrice + " and the engine will cost $" + EnginePrice + " adding up to a total of $" + (BodyPrice + EnginePrice + 20000) + " including the shops $20,000 build fee.");
            }
            }while(a != -1); // this is the code to exit if they don't want to listen to more cars
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
            System.out.println(cars1[CNM-1].toString()); // prints the new car parts
        }
        }while(modNum != 0);
    }
}