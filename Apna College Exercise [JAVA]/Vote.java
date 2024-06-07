
/*5. Write a function that takes in age as input and returns if that person is eligible
to vote or not. A person of age > 18 is eligible to vote. */
import java.util.*;

public class Vote {
    public static void vot(int age){

        if (age > 18) {
            System.out.println("You Are eligible for voting");
        }
        else{
             System.out.println("You Are Underage");
        }
        

   }

public static void main(String[] args) {
   
   Scanner sc = new Scanner(System.in);

   System.out.print("Enter age :");
   int age = sc.nextInt();

   vot(age);

sc.close();
}
}
