import java.util.*;
public class powerOFx {


     public static void power(int x,int n){
        int ans =  1;

        for(int i = 0;i<n;i++){
         ans = ans *x;
        }

    // Using Do-While Loop    
    //   int i = 0;
    //      do {
    //         ans = ans *x;
    //         i++;
    //      } while (i<n);

        System.out.println("ANSWER -> Power of X raised to n is :"+ans);

     }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter Value For X :");
        int x = sc.nextInt();
        System.out.print("Enter Value For n :");
        int n = sc.nextInt();

     


        power(x, n);
        sc.close();
    }
}
