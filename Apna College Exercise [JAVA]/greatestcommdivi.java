import java.util.*;


public class greatestcommdivi {

    public static void gcd(int a , int b){
      int c=0;
      for(int i=1;i<=a;i++){

         if(a%i==0 && b%i==0){
            c = i;
         }
      }
      System.out.println("GCD is :"+c);

    }


   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter 1st No :");
       int a = sc.nextInt();
       System.out.print("Enter 2nd No :");
       int b = sc.nextInt();
  
       gcd(a, b);
       sc.close();
   }   


}
