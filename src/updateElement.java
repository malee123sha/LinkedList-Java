import java.util.LinkedList;
public class updateElement {
    public static void main(String[] args) {
        LinkedList <String> ll = new LinkedList<>();
        ll.add("Combined Maths");
        ll.add("Physics");
        ll.add("Chemistry");
        ll.add("General English");
        System.out.println("Before Changing Element :- "+ll);
        ll.set(1, "Agriculture");
        System.out.println("After Changing Element :- "+ll);
    }
}
