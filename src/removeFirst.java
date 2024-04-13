import java.util.LinkedList;
public class removeFirst {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Combined Maths");
        ll.add("Physics");
        ll.add("Chemistry");
        ll.add("General English");
        System.out.println("Before Using Remove First:-"+ll);
        System.out.println("Remove First Element is  :-"+ll.removeFirst());
        System.out.println("After Using Remove First :-"+ll);
    }
}
