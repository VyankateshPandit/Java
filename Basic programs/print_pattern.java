import java.util.*;
public class print_pattern {
    public static void main(String[] args){ 

        Scanner sc = new Scanner (System.in);

         System.out.println("Choose : \n 1) Num Pattern \n 2) rectangle \n 3) hallow rectangle \n 4) left pyramide \n enter :");
        int button=sc.nextInt();

        switch (button) {
          case 1: 
          System.out.print("Enter Value :");
          int row=sc.nextInt();
           int i,j;

         for(i=1;i<=row;i++){

           for(j=1;j<=i;j++){
                System.out.print(i+"\t");
           }
           System.out.println();
         }

            break;

            case 2: 

            int n=4;
            int m=5;
 
             for ( i=1; i <=n; i++) {
               for( j=1; j<m; j++){
                 System.out.print(" * ");
                 
               }
               System.out.println(
 
               );
             }
            break;

            case 3:

            int N=4;
            int M=5;

            for ( i=1; i <=N; i++) {
              for( j=1; j<=M; j++){
                if(i==1 || j==1 || i==N || j==M){
                  System.out.print(" * ");

                }else{
                  System.out.print("   ");
                }
              }
              System.out.println(

              );
            }
            break;

            case 4:

            int a=4;

            for( i=1; i<=a; i++){
              for( j=1; j<=i; j++){ 
                 System.out.print(" * ");
              }
              System.out.println();
            }


            break;
        
          default:
          System.out.println("Invalid Input : Error !");
            break;
        }



         sc.close();
    }
}
    