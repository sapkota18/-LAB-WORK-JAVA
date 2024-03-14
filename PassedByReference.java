// Lab work no.17  
public class PassedByReference {
    int a = 40, b = 100;

    void add(PassedByReference ob) {
        ob.a = ob.a + 30;
        ob.b = ob.b + 40;
    }

    public static void main(String[] args) {
        PassedByReference ob = new PassedByReference();
        System.out.println("Before calling Function a=" + ob.a + " b=" + ob.b);
        ob.add(ob); 
        System.out.println("After calling Fuction a= " + ob.a + " b=" + ob.b);

    }
}
