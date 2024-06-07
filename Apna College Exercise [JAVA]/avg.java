/*1. Enter 3 numbers from the user & make a function to print their average. */

import java.util.*;

public class avg {


public static void average(int a, int b , int c){

    int add = a+b+c;
 
    int avg=add/3;
   System.out.println("Average Of "+a+","+b+","+c+" is :"+avg);



}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Find average of 3 Numbers :");
         

         System.out.print("Enter 1st Number :");
         int a =sc.nextInt();

         System.out.print("Enter 2nd Number :");
         int b =sc.nextInt();

         System.out.print("Enter 3rd Number :");
         int c =sc.nextInt();
        

          average(a, b, c);

        sc.close();
    }
}
