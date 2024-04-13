import java.util.LinkedList;
public class removeLast {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Combined Maths");
        ll.add("Physics");
        ll.add("Chemistry");
        ll.add("General English");
        System.out.println("Before Using Remove Last:-"+ll);
        System.out.println("Remove Last Element is:-:-"+ll.removeLast());
        System.out.println("After Using Remove Last :-"+ll);
    }
}
