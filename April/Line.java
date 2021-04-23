public class Line {
    Point p1;
    Point p2;
    public Line(){
        p1 = new Point();
        p2 = new Point();
    }
    public Line(Point p11, Point p22){
        p1 = p11;
        p2 = p22;
    }
    public Point getP1(){
        return p1;
    }
    public Point getP2(){
        return p2;
    }
    public static double getSlope(Line ln){
        double X2 = ln.getP2().getX();
        double X1 = ln.getP1().getX();
        double Y2 = ln.getP2().getY();
        double Y1 = ln.getP1().getY();
        if(X2 - X1 != 0){
            return (Y2 - Y1)/(X2 - X1);
        }else{
            return -0.0001;
        }
    }
    public String toString(){
        return "[ " + p1.toString() + ", " + p2.toString() + " ]";
    }
}
