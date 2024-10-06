package Arrays;
import java.util.*;
public class lenOfName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array :");
        int size=sc.nextInt();
        String[] names = new String[size];
        System.out.println("Enter names :");
        for (int i = 0; i < size; i++) {
            names[i]=sc.next();
        }
        System.out.print("Your array => [");
        for (int i = 0; i < size; i++) {
            System.out.print(names[i]+",");
        }
        System.out.println("]");

         int total = 0;
        for (int i = 0; i < size; i++) {
             int a =   names[i].length();
             total +=a;
        }
        System.out.println("Total length of array elements :"+total);


 sc.close();}
}
