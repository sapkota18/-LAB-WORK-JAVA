import java.util.LinkedList;
public class LinkedListOperation {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(49);
        linkedList.add(67);
        linkedList.add(5);
        linkedList.add(18);
        linkedList.add(7);
        linkedList.add(100);
        System.out.println("Linked List Elements are: "+linkedList);
        linkedList.remove(Integer.valueOf(67));
        System.out.println("Linked Elements After Deleting 67 :"+linkedList);
        linkedList.removeLast();
        System.out.println("Linked Elements After Deleting Last Element :"+linkedList);
    }
}
