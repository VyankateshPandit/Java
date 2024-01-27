import java.util.Scanner;

public class maximun_no {
    public static void main(String[] args){ 
 
        Scanner sc = new Scanner(System.in);


         System.out.print("Enter 1st No :");
         int a=sc.nextInt();

         System.out.print("Enter 2st No :");

         int b=sc.nextInt();

         System.out.print("Enter 3rd No :");

         int c=sc.nextInt();


         if (a>b) {
                 System.out.println("Maximun No Is "+a);   
         }
        else if(b>c){
                   System.out.println("Maximun No Is "+b);
        }
        else{
            System.out.println("Maximun No Is "+c);
        }

         

         
 
         sc.close();

    }
}
