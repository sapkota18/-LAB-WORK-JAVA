// LAB No.22
class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }
}

class Square extends Rectangle {

    public Square(int s) {
        super(s, s);
    }

}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(50, 10);
        Square square = new Square(67);
        System.out.println("Area of rectangle = " + rectangle.area());
        System.out.println("Perimeter of Rectangle = " + rectangle.perimeter());
        System.out.println("Area of Square = " + square.area());
        System.out.println("Perimeter of Square = " + square.perimeter());
    }
}
