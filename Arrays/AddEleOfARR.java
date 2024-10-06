package Arrays;

import java.util.*;

public class AddEleOfARR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter elements of array :");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Your array is ready :>");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " , ");
        }
        System.out.println();

        int add = 0;

        for (int i = 0; i < size; i++) {
            add = add + numbers[i];
        }

        System.out.println("Addition of array elements :" + add);

        sc.close();
    }
}
