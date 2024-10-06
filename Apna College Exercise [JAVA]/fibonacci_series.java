import java.util.*;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        int result = 0;
        int a = 0;
        int b =1;
        for (int i = 0; i <= n; i++) {
            result += a;
            a = b;
            b=result;
            System.out.print(result +" ");
        } 

        sc.close();
    }
}
