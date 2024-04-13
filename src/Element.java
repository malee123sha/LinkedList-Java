import java.util.LinkedList;
public class Element {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        System.out.println(ll);
        ll.add(1, 6);
        System.out.println(ll);
        ll.set(1, 7);
        System.out.println(ll);
        Integer ab = ll.remove(3);
        System.out.println(ll);
    }
}
