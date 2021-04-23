public class Point {
    private int x;
    private int y;

    public Point(){
        x = 0;
        y = -1;
    }
    public Point(int x1, int y1){
        x = x1;
        y = y1;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int newX){
        x = newX;
    }
    public void setY(int newY){
        y = newY;
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
