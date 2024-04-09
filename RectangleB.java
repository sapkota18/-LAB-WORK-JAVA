// lab no.15
public class RectangleB {
    int length, breadth;

    RectangleB(int l, int b) {
        length = l;
        breadth = b;
    }

    public int Area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        RectangleB R1 = new RectangleB(4, 5);
        RectangleB R2 = new RectangleB(5, 8);
        int area1 = R1.Area();
        int area2 = R2.Area();
        System.out.println("Area of  Rectangle1: " + area1);
        System.out.println("Area of Rectangle2: " + area2);
    }

}
