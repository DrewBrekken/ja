package March;
import java.util.*;
public class aRRay {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers are you giving me? ");
        int size = input.nextInt();
        int [] numbers = new int[size];
        int sum = 0;
        for(int i = 0; i < size; i++){
            System.out.print("What is the lucky number? ");
            numbers[i] = input.nextInt();
            sum = sum+numbers[i];
        }
        double average = (double)sum/size;
        for(int j = 0; j < numbers.length; j++){
            System.out.print(numbers[j] + ", ");
        }
        int [] othernumber = Arrays.copyOf(numbers, size);
        System.out.println("The average is " +average);
        System.out.println(Arrays.toString(othernumber));
        String arrays = Arrays.toString(numbers);
        System.out.println(arrays);
        Arrays.sort(othernumber);
        if(Arrays.equals(numbers, othernumber)){
            System.out.println("They are the same Array");
        } else {
            System.out.println("They are not the same");
        }
        if(Arrays.binarySearch(othernumber, 54) <0){
            System.out.println("54 is not in the Array");
        }
        System.out.println("The index of the number 54 is " + Arrays.binarySearch(othernumber, 54));
    }
}
