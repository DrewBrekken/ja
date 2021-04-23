public class LineMain {
    public static void main(String [] args){
        Point p3 = new Point(2,5);
        Point p4 = new Point(5,20);
        Line l2 = new Line(p3, p4);
        double slope = Line.getSlope(l2);
        if(slope > -0.0001 || slope < -0.0001){
            System.out.println("The slope is " + slope);
        }else{
            System.out.println("The slope of the line is undefined.");
        }
    }
}
