package March;
import java.util.*;
public class weather {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many temps are you giving me? ");
        int size = input.nextInt();
        int [] numbers = new int[size];
        int sum = 0;
        int y = 0;
        for(int i = 0; i < size; i++){
            System.out.print("Day " + (i+1)+ " high temp : ");
            numbers[i] = input.nextInt();
            sum = sum+numbers[i];
            }
        double average = (double)sum/size;
        System.out.printf("Average Temp : %.1f\n " , average);
        for(int j = 0; j < size; j++){
        if(numbers[j] > average){
                y = y+1;
    }
}
Arrays.sort(numbers);
    System.out.println(y + " days were over the average temp");
    System.out.println(Arrays.toString(numbers));
    System.out.println("The two coldest temps : " + numbers[0] + " " + numbers[1]);
    System.out.println("The two warmest temps : " + numbers[size-2] + " " + numbers[size-1]);
}
}

    

