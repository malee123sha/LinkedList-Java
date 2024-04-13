import java.util.LinkedList;
public class removeElement {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Combined Maths");
        ll.add("Physics");
        ll.add("Chemistry");
        ll.add("General English");
        System.out.println("Before Adding Element :- "+ll);
        String str = ll.remove(3);
        System.out.println("Removed Element :-"+str);
        System.out.println("After Adding Element :- "+ll);
    }
}
