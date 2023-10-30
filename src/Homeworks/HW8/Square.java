package Homeworks.HW8;

public class Square extends Figure{
    private int side1;

    public Square(){

    }

    public Square(int side1){
        this.side1 = side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide1() {
        return side1;
    }

    @Override
    public double calculateSquare() {

        return side1 * side1;
    }

    @Override
    public double calculatePerimeter() {
        return side1 * 4;
    }

//    @Override
//    public double area() {
//        return 0;
//    }
}
