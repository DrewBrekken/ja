package April;
import java.util.*;
public class dogmain {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        dog dog1 = new dog();
        dog dog2 = new dog("Finn", "labrador", "chocolate", 7);
        // if public variables you can do this
        //dog1.name = "Fluffy";
        //dog1.age = 4;
        //dog1.breed = "lab";
        //dog1.color = "white";
        //System.out.println(dog.toString(dog1));
        //System.out.println(dog1.toString());
        //dog1.setName("Gary");
        //System.out.println(dog1.getName());
        dog [] doggies = new dog[2];
        for(int i = 0; i < doggies.length; i++){
            System.out.println("Enter the dog's name");
            String name = input.next();
            System.out.println("Enter the dog's breed");
            String breed = input.next();
            System.out.println("Enter the dog's color");
            String color = input.next();
            System.out.println("Enter the dog's age");
            int age = input.nextInt();
            doggies[i] = new dog(name, breed, color, age);
        }
        System.out.println(Arrays.toString(doggies));
    }
}
