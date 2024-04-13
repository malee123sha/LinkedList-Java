import java.util.LinkedList;
public class findIndex {
        public static void main(String[] args) {
            LinkedList<String> ll = new LinkedList<>();
            ll.add("Combined Maths");
            ll.add("Physics");
            ll.add("Chemistry");
            ll.add("General English");
            System.out.println("Index of Chemistry is      :-"+ll.indexOf("Chemistry"));
            System.out.println("Index of General English is:-"+ll.indexOf("General English"));
            System.out.println("Index of Physics is        :-"+ll.indexOf("Physics"));
            System.out.println("Index of Combined Maths is :-"+ll.indexOf("Combined Maths"));
        }
}






