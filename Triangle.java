
// lab work no.12
import java.lang.Math;

public class Triangle {
    int side1;
    int side2;
    int side3;

    Triangle() {
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }

    double area() {
        double area, s;
        s = (this.side1 + this.side2 + this.side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    double perimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        double triangleArea = t.area();
        double trianglePerimeter = t.perimeter();

        System.out.println("Area of Triangle: " + triangleArea);
        System.out.println("Perimeter of Triangle: " + trianglePerimeter);
    }
}
