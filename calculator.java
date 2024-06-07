

import java.util.*;

 class calculator {
    public static void main(String[] args){

          Scanner sc = new Scanner(System.in);


          int operator , a, b;
          int result=0;

          System.out.print("Choose One No. to perform Operation \n 1) + \n 2) - \n 3) X \n 4) /  \n Enter No :");

          operator=sc.nextInt();

          System.out.print("Enter First No : ");

          a=sc.nextInt();
        
          System.out.print("Enter Second No : ");

                    b=sc.nextInt();


            switch (operator){

                case 1: result=a+b;
                break;
                
                case 2: result=a-b;
                break;

                case 3: result=a*b;
                break;

                case 4: result=a/b;
                break;

                default: System.out.println("Invalid Input! Please Select No between 1 to 4");

            }

               System.out.println("Result : " + result);

               sc.close();
    }
}



