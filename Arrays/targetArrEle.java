package Arrays;

import java.util.*;

public class targetArrEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int size = sc.nextInt();
        int[] number = new int[size];
        System.out.print("Enter array elements :");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println("Your array :");
        for (int i = 0; i < size; i++) {
            System.out.print(number[i] + ",");
        }
        System.out.println();
        int add = 0;
        System.out.print("Enter target value :");
        int target = sc.nextInt();

        for (int i = 0; i < size; i++) {
            add = number[i] + number[i + 1];
            if (add == target) {
                System.out.println("Target match found :" + number[i] + "+" + number[i + 1]);
                System.out.print("indices :");
                System.out.print(i + ",");
                System.out.println(i + 1);
            }
        }

        sc.close();
    }
}