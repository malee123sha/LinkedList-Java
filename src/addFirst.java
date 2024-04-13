import java.util.LinkedList;
public class addFirst {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Combined Maths");
        ll.add("Physics");
        ll.add("Chemistry");
        ll.add("General English");
        System.out.println("Before Add First:-"+ll);
        ll.addFirst("GIT");
        System.out.println("After Add First :-"+ll);
    }
}
