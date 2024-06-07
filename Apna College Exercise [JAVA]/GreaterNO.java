/*3. Write a function which takes in 2 numbers and returns the greater of those
two. */

import java.util.*;
public class GreaterNO {


     public static void max(int a,int b){

         if (a>b) {
            System.out.println(a+ " is greater number");
         }

         else if (a==b){

             System.out.println("Both Are Equal");

         }
         else{
             System.out.println(b+" is greater number");
         }

         

     }
          


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter 1st No : ");
         int a = sc.nextInt();

         System.out.print("Enter 2nd No :");
         int b =sc.nextInt();

      max(a, b);   


sc.close();
    }
}
