//To seaarch element in a list and join two arraylists ->
package Collections;

import java.util.*;

public class Arraylist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> l1 = new ArrayList<String>();
        List<String> l2 = new ArrayList<String>();

        System.out.println("How many elements you want to insert in list1 & list2 :");
        int elements = sc.nextInt();
        System.out.println("Enter elements for list 1:");
        for (int i = 0; i < elements; i++) {
            l1.add(sc.next());
        }
        System.out.println("List 1 elements :" + l1);

        System.out.println("Enter elements for list 2:");
        for (int i = 0; i < elements; i++) {
            l2.add(sc.next());
        }
        System.out.println("List 2 elements :" + l2);

        System.out.println("Enter element you want to search :");

        String str = sc.next();
        if (l1.contains(str)) {
            System.out.println("Element found! in list 1");
        } else if (l2.contains(str)) {
            System.out.println("Element found! in list 2");

        } else {
            System.out.println("There is no such element!");

        }
        ArrayList<String> l3 = new ArrayList<String>();
        l3.addAll(l1);
        l3.addAll(l2);

        System.out.println("Join array L1 & L2:");

        Iterator it = l3.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        sc.close();
    }
}