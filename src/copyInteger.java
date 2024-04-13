import java.util.LinkedList;
public class copyInteger {
    public static void main(String[] args) {
            LinkedList<Integer> linkedList1 = new LinkedList<>();
            linkedList1.add(100);
            linkedList1.add(200);
            linkedList1.add(300);
            linkedList1.add(400);
            //clone the first LinkedList
            LinkedList <Integer> linkedList2 = (LinkedList<Integer>)linkedList1.clone();
            //print all elements available in linkedList1
            //linkedList2 has similar elements to linkedList1
            System.out.println("LinkedList ="+linkedList2);
        }
}
