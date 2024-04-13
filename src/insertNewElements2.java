import java.util.LinkedList;
public class insertNewElements2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Combined Maths");
        ll.add("Physics");
        ll.add("Chemistry");
        ll.add("General English");
        System.out.println("Before Adding Element:- "+ll);
        ll.add(2,"ICT");
        System.out.println("After Adding Element :- "+ll);
    }
}
