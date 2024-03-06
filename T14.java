public class T14 {
    int side1, side2, side3;

    T14(int s1, int s2, int s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public double returnarea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public int returnperimeter() {
        return (side1 + side2 + side3);
    }

    public static void main(String[] args) {
        T14 traingle = new T14(3, 4, 5);
        System.out.println("Area  of traingle is : " + traingle.returnarea());
        System.out.println("Perimeter of the triangle is :" + traingle.returnperimeter());
    }

}
