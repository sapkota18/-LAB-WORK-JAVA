import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            int i,n;
            System.out.print("Enter a number: ");
            n=scanner.nextInt();
            for(i=1;i<=10;i++)
            {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
            scanner.close();
        }
    }
    
}
