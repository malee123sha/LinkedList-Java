import java.util.LinkedList;
public class iteratingLoops {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Combined Maths");
        ll.add("Physics");
        ll.add("General English");
        ll.add(1,"Chemistry");
        System.out.println(ll);
        //use For Loop with get method
        for (int i = 0;i < ll.size();i++) {
            System.out.print(ll.get(i)+",");
        }
        System.out.println();
        //Use For-Each Loop
        for (String s : ll) {
            System.out.print(s+",");
        }
    }
}
//iterating the linked list
