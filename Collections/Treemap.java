package Collections;

import java.util.*;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> mp = new TreeMap<>();
        mp.put(1, "Red");
        mp.put(2, "White");
        mp.put(3, "Green");
        mp.put(4, "Yellow");
        System.out.println("Orignal TreeMap :" + mp);

        System.out.println("Least key :" + mp.firstEntry());
        System.out.println("Greatest key :" + mp.lastEntry());

        System.out.println("Sub map key values" + mp.subMap(1, 4));

    }
}
