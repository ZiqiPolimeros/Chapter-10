/*
9. Look at the following interface: 
public interface Computable 
{
   double compute(double x);
}  
Write a statement that uses a lambda expression to create an object 
that implements the Computable interface. 
The object’s name should be half. 
The half object’s compute method should return the value of the x parameter divided by 2.
*/
import java.util.*;
public class LambdaExpression
{
   public static void main (String[]args)
   {
      int num;
      
      Scanner s = new Scanner(System.in);
      Computable half = x->x/2;
      
      System.out.println("Enter a number:");
      num = s.nextInt();
      System.out.println("The half of "+ num + ":  " + half.compute(num));
      
   }
}