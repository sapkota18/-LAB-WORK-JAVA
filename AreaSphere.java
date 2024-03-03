import java.util.Scanner;
public class AreaSphere{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of Sphere:  ");
        float r=sc.nextFloat();
        double area=4*Math.PI*r*r;
        double volume=(4.0/3.0)*Math.PI*r*r*r;
        System.out.println("Area of Sphere: "+area);
        System.out.println("Volume of Sphere: "+volume);
        sc.close();
    }
}