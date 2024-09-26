package arrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Volvo");
        linkedList.add("Toyota");
        linkedList.add("BMW");
        System.out.println(linkedList);
        linkedList.addFirst("Jeep");
        System.out.println(linkedList);
        linkedList.addLast("Ford");
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        Collections.sort(linkedList);
        System.out.println(linkedList);
        Collections.sort(linkedList, Collections.reverseOrder());
        System.out.println(linkedList);

    }
}
