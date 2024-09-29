//To retrive and remove first and last element of treeset and print less than 7 elements
package Collections;

import java.util.*;

public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(7);
        ts.add(90);
        System.out.println("Orignal TreeSet :" + ts);
        System.out.println("First element :" + ts.getFirst() + ", Last element :" + ts.getLast());
        ts.removeFirst();
        ts.removeLast();
        System.out.println(
                "After removing first and last element in TreeSet :" + ts);

        TreeSet<Integer> tts = new TreeSet<>();
        tts = (TreeSet<Integer>) ts.headSet(7);
        System.out.println("No less than 7 :" + tts);

    }
}
