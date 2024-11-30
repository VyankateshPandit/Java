package Arrays;

import java.util.*;

class avgOfPositiveNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int positiveCount = 0;

        int add = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter elements >:");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if (a[i] >= 0) {
                positiveCount++;
                add = add + a[i];
            }
        }

        int avg = add / positiveCount;
        System.out.println("Avarage all positive no is :" + avg);
        sc.close();
    }
}