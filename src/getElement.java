import java.util.LinkedList;
public class getElement {
    public static void main(String[] args) {
        LinkedList <String> ll = new LinkedList<>();
        ll.add("Combined Maths");
        ll.add("Physics");
        ll.add("Chemistry");
        ll.add("General English");
        ll.get(0);
        String str = ll.get(0);
        System.out.println("Element at Index 0 :-"+str);
    }
}
