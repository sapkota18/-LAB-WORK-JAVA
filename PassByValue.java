// Lab work no.17

class A {
    int a, b;

    void add(int x, int y) {
        a = x + 3;
        b = y + 3;
    }
}

public class PassByValue {
    public static void main(String args[]) {
        A obj = new A();
        int a = 40, b = 100;

        System.out.println("Before function call a = " + a + " b = " + b);
        obj.add(a, b);
        System.out.println("After function call a = " + a + " b = " + b);
    }
}
