//To ietrate list in reverse order and add element at first and last position -->
package Collections;

import java.util.*;

public class linkedkist {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<String>();
        ls.add("red");
        ls.add("blue");
        ls.add("green");
        ls.addFirst("black");
        ls.addLast("yellow");
        System.out.println("Orignal linkedList :" + ls);

        Iterator it = ls.descendingIterator();

        System.out.println("Reverse order of list :");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
