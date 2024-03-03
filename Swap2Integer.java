 import java.util.Scanner;
 public class Swap2Integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1,number2,temp;
        System.out.print("Enter Two Numbers: ");
        number1=sc.nextInt();
        number2=sc.nextInt();
        System.out.println("Numbers before swapping number1="+number1 +" and " +"number2="+number2);
        temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("Numbers after swapping number1="+number1 +" and " +"number2="+number2);
        sc.close();

    }
    
}
