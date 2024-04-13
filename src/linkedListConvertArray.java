import java.util.LinkedList;
public class linkedListConvertArray {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Combined Maths");
        ll.add("Physics");
        ll.add("Chemistry");
        ll.add("General English");
        System.out.println(ll);
        Object [] b = ll.toArray();
        System.out.println("After Converting to Array:-");
        for (Object x : b) {
            System.out.print(x+"  ");
        }
    }
}
//Convert LinkedList to Array Using "toArray();" method
