package March;
import java.util.*;
public class isThisStudentValid {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int A1, A2, S1, S2;
        double G1, G2;
        System.out.println("Student 1: What is your ACT score? ");
        A1 = input.nextInt();
        System.out.println("Student 1: What is your SAT score? ");
        S1 = input.nextInt();
        System.out.println("Student 1: What is your GPA? ");
        G1 = input.nextDouble();
        System.out.println("Student 2: What is your ACT score? ");
        A2 = input.nextInt();
        System.out.println("Student 2: What is your SAT score? ");
        S2 = input.nextInt();
        System.out.println("Student 2: What is your GPA? ");
        G2 = input.nextDouble();
        if(A1 == A2){
            System.out.println("They have the same ACT score.");
        }else if(A1 > A2){
            System.out.println("Student 1 has a better ACT score.");
        } else{
            System.out.println("Student 2 has a better ACT score."); 
        }
        if(S1 == S2){
            System.out.println("They have the same SAT score.");
        }else if(S1 > S2){
            System.out.println("Student 1 has a better SAT score.");
        } else{
            System.out.println("Student 2 has a better SAT score."); 
        }
        if(G1 == G2){
            System.out.println("They have the same GPA.");
        }else if(G1 > G2){
            System.out.println("Student 1 has a better GPA.");
        } else{
            System.out.println("Student 2 has a better GPA."); 
        }
}
}
