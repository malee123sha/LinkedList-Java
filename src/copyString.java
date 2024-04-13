import java.util.LinkedList;
public class copyString {
        public static void main(String[] args) {
            LinkedList<String> linkedList1 = new LinkedList<>();
            linkedList1.add("Combined Maths");
            linkedList1.add("Physics");
            linkedList1.add("Chemistry");
            linkedList1.add("General English");
            //clone the first LinkedList
            LinkedList <String> linkedList2 = (LinkedList<String>)linkedList1.clone();
            //print all elements available in linkedList1
            //linkedList2 has similar elements to linkedList1
            System.out.println("LinkedList ="+linkedList2);
    }
}
