import java.util.*;


public class calc_using_if_else {
    public static void main (String[] agrs){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number :");
        int a=sc.nextInt();
        System.out.print("Enter Operator (+,-,X,/,%) :");
        String Operator=sc.next();
        System.out.print("Enter Second Number :");
        int b=sc.nextInt();
        int sum;





        if(Operator=="+"){ 
               System.out.println(a+b);
        }
        else if(Operator=="-"){

            sum=a-b;
               System.out.println(sum);
        }
        else if(Operator=="X"){

            sum=a*b;
               System.out.println(sum);
        }
        else if(Operator=="/"){

            sum=a/b;
               System.out.println(sum);
        }
        else if(Operator=="%"){

            sum=a%b;
               System.out.println(sum);
        }
        else{
            System.out.println("Invalid Operator");
        }
        

sc.close();
    }
}
