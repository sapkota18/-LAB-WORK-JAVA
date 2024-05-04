import java.io.*;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\student.txt");
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fos);

            int n, rollno;
            String name, address, cname;
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of students: ");
            n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("\nRoll no: ");
                rollno = sc.nextInt();
                System.out.print("Name: ");
                name = sc.next();
                System.out.print("Address: ");
                address = sc.next();
                System.out.print("College name: ");
                cname = sc.next();

                dos.writeInt(rollno);
                dos.writeUTF(name);
                dos.writeUTF(address);
                dos.writeUTF(cname);
            }
            dos.close();

            System.out.println("\nStudent information saved to student.txt");

            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);

            System.out.println("\nROLLNO\tNAME\tADDRESS\tCOLLEGE");

            for (int i = 0; i < n; i++) {
                rollno = dis.readInt();
                name = dis.readUTF();
                address = dis.readUTF();
                cname = dis.readUTF();

                if (address.trim().equalsIgnoreCase("chitwan")) {
                    System.out.println(rollno + "\t" + name + "\t" + address + "\t" + cname);
                }
            }
            dis.close(); 
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
