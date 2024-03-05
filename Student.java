
public class Student {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println("NAME:   " + this.name);
        System.out.println("ROLL NO:" + this.rollno);
    }

    public static void main(String[] args) {
        Student s1 = new Student(2, "John");
        s1.display(); 
    }
}
