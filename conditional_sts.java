import java.util.*;
 class conditional_sts {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
            
        
          System.out.print("Enter Number Between 1 to 4 :");
        int button = sc.nextInt();

// if , else


        //   if(button == 1){
        //      System.out.println("Hello");
        //   }
        //   else if(button == 2){
        //      System.out.println("Namaste");
        //   } 
        //   else{
        //              System.out.println("Invalid input , please select between 1 or 2");
        //   }









           switch (button) {
            case 1: System.out.println("hello");
                
                break;
           case 2 :  System.out.println("namaste");

           case 3: System.out.println("Hola");
           break;

           case 4: System.out.println("Bonjour");
            break;
           
            default:    System.out.println("Invalid input , please Enter between 1 or 4");
                break;
           }


     sc.close();

   }
}
