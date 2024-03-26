interface shape1 {
    void  draw();
}
interface shape2{
    void resize();
}
class Rectangle1 implements shape1,shape2{
    public void draw()
    {
        System.out.println( "Drawing a rectangle" );
    }
    public void  resize(){
        System.out.println( "Resizing the rectangle" );
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1();
        r.draw();
        r.resize();
    }
    
}
