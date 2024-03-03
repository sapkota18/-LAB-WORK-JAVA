import java.util.Scanner;
public class SimpleInterest {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        double principle, rate,time,interest;
        System.out.print("Enter Principle,rate and time:");
        principle=scanner.nextDouble();
        rate=scanner.nextDouble();
        time=scanner.nextDouble();
        interest=(principle*rate*time)/100;
        System.out.print("Simple interest="+interest);
        scanner.close();

    }
    
}
