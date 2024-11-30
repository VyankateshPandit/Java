import java.util.Scanner;

public class function{


public static void p_m_name(int n){
     
 
      int fact =1;


       if(n < 0)
       {
              System.out.println("Error!");
              return;
       }

        else{
            for(int i = 1 ; i<=n ; i++){
                fact= fact*i; 
       }

        System.out.println("Factorial is :"+ fact);
     
        }
    
}


public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter Number :");
           int n =sc.nextInt();
    
         p_m_name(n);

sc.close();
}
}