package Strings;

import java.util.*;

public class RevStr_StrBldr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to reverse > ");
        String input = sc.next();
        StringBuilder str = new StringBuilder(input);
        StringBuilder Revstr = new StringBuilder();
        char temp;
        System.out.println("Orignal string > " + str);
        for (int i = str.length() - 1; i >= 0; i--) {
            temp = str.charAt(i);
            Revstr.append(temp);
        }
        System.out.println("Reversed string > " + Revstr);
        sc.close();
    }
}
