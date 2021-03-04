package Febuary;
/*
Drew Brekken
02/22/2021
Learnign about while loops and practicing if statements
*/
public class conditionalloop {
    public static void main(String [] args){
        boolean test = lessUseless(8, "Grade");
        uselessMethod(2, "Peter", test); // static void method (it has no object reference)
                                        //void method (it does not return values)
    }
    public static boolean lessUseless(int num, String name){
        if(num > 7 && name.equalsIgnoreCase("gRADE")){
            return true;
        }
        return false;
        
    }
    private static void uselessMethod(int num, String name, boolean test){
        //check for condition first
        while(test){
            System.out.println("I am useless");
            num ++;
            if(num > 5){
                test = false;
            }
        }
    
    // dowhile runs program once before it checks a condition
    do{
        System.out.println("I am usefull");
        num --;
    }
    while(num > 9);
}
}
