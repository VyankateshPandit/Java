//To clone hashset into another hashset and empty hashset ->
package Collections;

import java.util.*;

public class Hashset {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("ram");
        hs.add("krishna");
        hs.add("shame");
        hs.add("Bheem");
        System.out.println("Orignal hashset :" + hs);
        HashSet<String> chs = new HashSet<>();
        chs = (HashSet<String>) hs.clone();
        System.out.println("Cloned hashset :" + chs);
        hs.removeAll(hs);
        System.out.println("After removal :" + hs);

    }
}
