package Arrays;
import java.util.*;
public class Search_in_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many rows you want in matrix :");
        int row = sc.nextInt();
        System.out.print("Enter how many columns you want in matrix :");
        int col = sc.nextInt();
        int number[][] = new int[row][col];
        System.out.println("NOTE! ... Do not forgot to give space after single element :");
        System.out.println("Enter elements now :");      
          
        // i loop is  for rows
        for(int i = 0; i < row; i++){
    
            //  j loop is for columns
           for(int j=0; j < col; j++){
            number[i][j] = sc.nextInt();
           }
        }
        System.out.print("Which element you want to search :");
        int x =sc.nextInt();

        for(int i=0; i< row; i++){
            for (int j = 0; j < col; j++) {
                if (number[i][j]==x) {
                    System.out.println(x +" Element found at index :(" + i +","+j +")");
                }
            }
        }

        sc.close();
    }
}
