import java.util.Scanner;

public class ExceptionHandalingExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter two Numbers:  ");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            sc.close();
            int result=num1/num2;
            System.out.println("RESULT  = "+result);

        }
        catch(ArithmeticException e){
            System.out.println(e);
    }
    finally{
        System.out.println("Thank you for using the program.");
    }
}
}
