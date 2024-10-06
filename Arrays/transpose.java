package Arrays;
import java.util.*;
public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many rows you want in matrix :");
        int row = sc.nextInt();
        System.out.print("Enter how many columns you want in matrix :");
        int col = sc.nextInt();
        int number[][] = new int[row][col];
        System.out.println("NOTE! ... Do not forgot to give space after single element :");
        System.out.println("Enter elements now :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your matrix :" + row + " X " + col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

        // swapping values of row to col and col to row
        int U_row = col;
        int U_col = row;
        System.out.println("Transposed matrix :" + U_row + " X " + U_col);
        for (int i = 0; i < U_row; i++) {
            for (int j = 0; j < U_col; j++) {
                System.out.print(number[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
