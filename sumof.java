import java.util.*;

public class sumof {
   public static void main(String[] args){

     Scanner sc=new Scanner(System.in);
 
       System.out.print("Enter No. :");
      
       int n=sc.nextInt();

       int result=0;
       for (int i = 1; i <=n; i++) {

        result=result+i;
      
       }
       System.out.println("Sum of 1 to "+ n + " is :"+result);

         sc.close();
       
    }
}
