/**
 * reverseNo
 */
import java.util.*;
public class reverseNo {
public static void main(String[] args) {
    
    Scanner sc = new Scanner (System.in);

    System.out.print("Enter no :");
    int number = sc.nextInt();
    int reverseNo = 0;

    System.out.println("Original number :"+number);


    while (number !=0){
 
      int a =  number%10;
      int c = a*10;
      int b = number/10;
      reverseNo = c + b;
      number = a/10;
    }
    System.out.println("Reversed number :"+reverseNo);

sc.close();
}
    
}