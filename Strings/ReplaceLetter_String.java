package Strings;
/**
 * ReplaceLetter_String
 */
import java.util.*;
public class ReplaceLetter_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string :");
        String str = sc.next();

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='e') {
                result = result + 'i';
            }
            else{
                result = result + str.charAt(i);
            }
        }

        System.out.println("Output :"+result);

        sc.close();
    }
    
}