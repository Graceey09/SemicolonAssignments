import java.util.Scanner;

public class AverageAcceleration{
   
   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the starting velocity (m/s):");
      double startingVelocity = input.nextdouble();
      
       System.out.print("Enter the ending velocity (m/s):");
       double endingVelocity = input.nextdouble();
       
       double averageAcceleration = (endingVelocity - startingVelocity)/timeSpan;
       
       System.out.println(Average acceleration: " + averageAcceleration + "m/s^2");
       
       input.close();
     }
 }
