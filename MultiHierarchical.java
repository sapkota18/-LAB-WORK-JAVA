class Fruit {
    protected String name;
    protected String taste;
    protected String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("This is a "+" " + name +" "+ "it's taste is " + taste);
    }
}

class Apple extends Fruit {
    Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    public void eat() {
        super.eat();
        System.out.println("It is very Big \n");
    }

}

class Orange extends Fruit {
    Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    public void eat() {
        super.eat();
        System.out.println("It is very small\n ");
    }

}

public class MultiHierarchical {
    public static void main(String[] args) {
        Fruit apple = new Apple("Apple", "Sweet", "Big");
        Fruit orange = new Orange("Orange", "Tart", "Small");

        apple.eat();
        orange.eat();

    }
}
