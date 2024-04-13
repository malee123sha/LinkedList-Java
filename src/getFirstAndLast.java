import java.util.LinkedList;
public class getFirstAndLast {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Combined Maths");
        ll.add("Physics");
        ll.add("Chemistry");
        ll.add("General English");
        System.out.println(ll);
        System.out.println("Get the First Element is :-"+ll.getFirst());
        System.out.println("Get the Last Element is  :-"+ll.getLast());
    }
}
