import java.io.*;

class Student implements Serializable {
    int rollno;
    String name;
}

public class SerializeExample {
    public static void main(String args[]) {
        Student s = new Student();
        s.rollno = 5;
        s.name = "Bimala";


        try {
            FileOutputStream fout = new FileOutputStream("d:\\Student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s);
            out.close();
            fout.close();
            System.out.println("Serialized data is saved in Student.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            FileInputStream fin = new FileInputStream("D:\\Student.ser");
            ObjectInputStream in = new ObjectInputStream(fin);
            s = (Student) in.readObject();
            System.out.println("Rollno = " + s.rollno);
            System.out.println("Name = " + s.name);
            in.close();
            fin.close();

            // Save deserialized data into a file
            FileWriter writer = new FileWriter("D:\\DeserializedData.txt");
            writer.write("Rollno = " + s.rollno + "\n");
            writer.write("Name = " + s.name);
            writer.close();
            System.out.println("Deserialized data is saved in DeserializedData.txt");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
