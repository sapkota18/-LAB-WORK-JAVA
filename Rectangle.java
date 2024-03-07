public class Rectangle {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int Area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(4, 5);
        Rectangle R2 = new Rectangle(5, 8);
        int area1 = R1.Area();
        int area2 = R2.Area();
        System.out.println("Area of  Rectangle1: " + area1);
        System.out.println("Area of Rectangle2: " + area2);
    }

}
