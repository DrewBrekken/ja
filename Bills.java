public class Bills {
    public static final double tax=8.0/100; //static constant
    public static final double tip=15.0/100;
    public static void main(String [] args) {
        double bill1 = 23.89;
        double bill2 = 34.45;
        double bill3 = 41.29;
        double sum = bill1+bill2+bill3;
        System.out.println("Bill:  "+ sum);
        System.out.println("Tax:   "+ sum*tax); //Have to make 8 be 8.0 to be a real number
        System.out.println("Tip:   "+ sum*tip);
        System.out.println("Total: "+ sum+(sum*tax)+(sum*tip));
        for(int line=1; line <= 5; line++) {
            for(int star=0; star < line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
