/*
2. Write a function to print the sum of all odd numbers from 1 to n.
 */
import java.util.*;
public class sumOfOdd {


     public static void odd(int N){

         int a=0;
        for(int i=1;i<=N;i++){

            if (i%2!=0){
                System.out.println(i);
                 a += i;
            }
          

        }
        System.out.println("Sum of Odd No till " +N+" is :"+a);

        
     }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter End No :");
        int N = sc.nextInt();
       
        odd(N);
 
sc.close();
    }
}