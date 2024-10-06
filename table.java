import java.util.*;

public class table {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter No. :");

    int table = sc.nextInt();

    for (int i = 1; i < 11; i++) {
      System.out.println(table + "x" + i + "=" + table * i);
    }

    sc.close();

  }
}
