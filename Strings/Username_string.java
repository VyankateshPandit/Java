package Strings;
import java.util.*;
public class Username_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email ID :");
        String email = sc.nextLine();
        String username = "";

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i)=='@') {
            System.out.println("Username :"+email.substring(0, i));
            break;
            }
            else{
                username = username + email.charAt(i);
            }
        }

        sc.close();
    }
}
