// linear search technique

import java.util.*;
public class searchNoinArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array :");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter array elements :");
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
         
        System.out.print("[");

        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i]+",");
        }

        System.out.print("]");


        System.out.print(" Which element you want to search :");
        int x =sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (numbers[i]==x) {
                System.out.println(x+" found at index "+i);
            }
        }

        sc.close();
    }
}
