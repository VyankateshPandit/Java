import java.util.*;

class loops {
    public static void main(String[] args){ 
    
         Scanner sc = new Scanner(System.in);


         int no;

          System.out.print("Enter Value to Print Hello :");

           no=sc.nextInt();

           //For Loop ->

            System.out.println("You Have Entered "+no+" Value And Here is Your Hello Output till "+no+" :");
/*

        for(int i=1;i<=no;i++){
             System.out.println(i+") Hello");
        }
         */

          // While Loop ->

        /*    int i=1;

          while(i<=no){


             System.out.println(i+") Hello");

             i++;

          }     */



          // Do-While ->

    /*    int i=1;


         do {
                System.out.println(i+") hello");

                i++;
            
         } while (i<=no);   */







         sc.close();

    }
}
