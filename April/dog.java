package April;

public class dog {
    private String name = "";
    private String breed = "";
    private int age = 0;
    private String color = "";
 // constructors
    public dog(){
        name = "0";
        age = 0;
        breed = "0";
        color = "0";
    }
    public dog(String name1, String breed1, String color1, int age1){
        if(name1.length() <= 10){
            name = name1;
        }else{
            name = name1.substring(0,9);
        }
        breed = breed1;
        color = color1;
        if(age1 <= 20){
        age = age1;
        }else{
            age = 0;
        }
    }
// assesor methods get your values of your fields
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public String getColor(){
        return color;
    }
    public int getAge(){
        return age;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setBreed(String newBreed){
        breed = newBreed;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public static String toString(dog ob){
        return ("The dog's name is "+ ob.name + ", "+ ob.name + " is "+ ob.age + " years old, "+ ob.name + " is a " + ob.breed + ", "+ ob.name + " is " + ob.color);
    }
    public String bark(){
        return(name + " is barking, woof woof woof");
    }
    public String toString(){
        return(name + " is a " + breed + ", "+ name + " is " + age + " years old, and " + color + ".");
    }
}
