import java.util.Scanner;
public class CharAT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  a string: ");
        String str =sc.nextLine();
        if(str.length()>=4)
        {
            char c=str.charAt(3);
            System.out.println("Character at index 3 is: "+c);
        }
        else{
            System.out.println("String is too short to get character at index 3");
        }
    }
    
}
