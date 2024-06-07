package Arrays;
import java.util.*;
public class checkSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int size =sc.nextInt();
        int num[] = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for (int i = 0; i < size-1; i++) {
            if (num[i] > num[i+1]) {
              isAscending = false;
            }


        }

         if (isAscending) {
            System.out.println("Arrray is sorted");
         }

         else{
            System.out.println("Arrray is not sorted");
         }

sc.close();
    }
}
