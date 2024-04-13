import java.util.LinkedList;
public class addLast {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Combined Maths");
        ll.add("Physics");
        ll.add("Chemistry");
        ll.add("General English");
        System.out.println("Before Add Last:-" + ll);
        ll.addLast("GIT");
        System.out.println("After Add Last :-" + ll);
    }
}
