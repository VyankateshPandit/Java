import java.util.*;

public class percentage {
    public static void main(String[] args){

         Scanner sc= new Scanner(System.in);

       System.out.print("\n");

         System.out.print("Choose Number To Receive Service : \n 1) Total Of Subjects \n 2) Percentage \n 3) Pass or Fail \n 4) All Of Above \n Enter : ");


        float eng,math,sci,his,geo;
        float percentage,total;
        int button=sc.nextInt();
          switch (button) {

            case 1:     
            System.out.print("Enter English Marks :");
            eng=sc.nextFloat();
    
            System.out.print("Enter Maths Marks :");
    
            math=sc.nextFloat();
    
            System.out.print("Enter Science Marks :");
    
            sci=sc.nextFloat();
    
            System.out.print("Enter History Marks :");
    
            his=sc.nextFloat();
    
            System.out.print("Enter Geography Marks :");
    
            geo=sc.nextFloat();
     
                     total=eng+his+geo+math+sci;
                   
                   System.out.println("Total of Subjects :"+total);
                
                break;

                case 2:
                  

        System.out.print("Enter English Marks :");
        eng=sc.nextFloat();

        System.out.print("Enter Maths Marks :");

        math=sc.nextFloat();

        System.out.print("Enter Science Marks :");

        sci=sc.nextFloat();

        System.out.print("Enter History Marks :");

        his=sc.nextFloat();

        System.out.print("Enter Geography Marks :");

        geo=sc.nextFloat();

        total=eng+his+geo+math+sci;
        percentage = (total/500)*100;

        System.out.println("\n");

        System.out.println("Percentage :"+percentage+"%");
                break;

          case 3: 
                  
        System.out.print("Enter English Marks :");
        eng=sc.nextFloat();

        System.out.print("Enter Maths Marks :");

        math=sc.nextFloat();

        System.out.print("Enter Science Marks :");

        sci=sc.nextFloat();

        System.out.print("Enter History Marks :");

        his=sc.nextFloat();

        System.out.print("Enter Geography Marks :");

        geo=sc.nextFloat();

        total=eng+his+geo+math+sci;
        percentage = (total/500)*100;

        System.out.println("\n");


        if(percentage>34.0){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

          break;

          case 4:
                     
        System.out.print("Enter English Marks :");
        eng=sc.nextFloat();

        System.out.print("Enter Maths Marks :");

        math=sc.nextFloat();

        System.out.print("Enter Science Marks :");

        sci=sc.nextFloat();

        System.out.print("Enter History Marks :");

        his=sc.nextFloat();

        System.out.print("Enter Geography Marks :");

        geo=sc.nextFloat();

        total=eng+his+geo+math+sci;
        percentage = (total/500)*100;

        System.out.println("\n");

        System.out.println("Total of Subjects :"+total);

        System.out.println("Percentage :"+percentage+"%");


        if(percentage>34.0){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
 
          break;
            default:   System.out.println("Invalid Input : Error!");
                break;
          }
        
sc.close();
    }
}
