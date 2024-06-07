import java.util.*;
/**
 * Solutions
 */
public class countNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positive = 0 , negative = 0 , zero = 0;

        System.out.print("Press 1 to continue and 0 to stop ->");
        int input = sc.nextInt();
        
        
          while (input==1) {
            System.out.print("Enter No :");
            int num = sc.nextInt();
                if (num >0) {
                    positive++;
                }
                else if (num < 0) {
                    negative++;
                }
                else{
                    zero++;
                }
                System.out.print("Press 1 to continue and 0 to stop ->");
                 input = sc.nextInt();
          }

           System.out.println("Positives :"+positive);
           System.out.println("Positives :"+negative);
           System.out.println("Positives :"+zero);

sc.close();
    }

}    