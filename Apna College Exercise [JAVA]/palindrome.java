import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no :");
        int num = sc.nextInt();
        
        int a = num%10;

        if (num/a==11) {
            System.out.println("Entered number "+num+" is palindrome number");
        }
        else if (num/a==111) {
            System.out.println("Entered number "+num+" is palindrome number");
        }
        else{
            System.out.println("Entered number "+num+" is not palindrome number");

        }

        sc.close();
    }
}
