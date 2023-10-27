package Homeworks.HW7;

public class Point {
    private int x;
    private  int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void info(){
        System.out.println("X: " + x + "  Y: " + y);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}
