import java.util.*;
public class fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No :");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int temp = 0;
 
         System.out.println("Fibonacii series =>");
         System.out.print(a+",");
         System.out.print(b+",");
        for (int i=0;i<n;i++){

             temp = a+b;
             a = b ;
             b = temp;
             System.out.print(temp+",");
            
        }
         System.out.print("<= END");
         System.out.println();

        sc.close();

    }
}