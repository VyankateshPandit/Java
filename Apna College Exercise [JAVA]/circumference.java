
/*4. Write a function that takes in the radius as input and returns the
circumference of a circle. */
import java.util.*;

public class circumference {


        public static void curcum(int r){

             double c = 2*3.14*r;
             System.out.println("circumference :"+c);


        }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius :");
        int r = sc.nextInt();

        curcum(r);

sc.close();
    }
}
