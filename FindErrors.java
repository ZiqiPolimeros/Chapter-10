Find the error Find the error in each of the following code segments: 
1. // Superclass 
   public class Vehicle 
   {   
        (Member declarations . . .) 
   } 
   // Subclass 
   public class Car expands Vehicle 
   {   
       //(Member declarations . . .) 
   }	
2.	
   // Superclass 
   public class Vehicle 
   {   
      private double cost;   
      (Other methods . . .) 
   } 
   // Subclass 
   public class Car extends Vehicle 
   {   
      public Car(double c)   
   {   
       cost = c;   
       } 
       }	
3.	// Superclass 
   public class Vehicle 
   {   
      private double cost;   
      public Vehicle(double c)   
   {       
      cost = c;   
   }   
       (Other methods . . .) 
   } 
   // Subclass 
   public class Car extends Vehicle
   {   
      private int passengers;   
      public Car(int p)   
   {    
      passengers = c;
         }   
         (Other methods . . .) 
         }	
4.	
// Superclass 
public class Vehicle 
{
   public abstract double getMilesPerGallon();   
      (Other methods . . .) 
   } 
   // Subclass 
   public class Car extends Vehicle 
   {   
      private int mpg;   
      public int getMilesPerGallon();   
   {      
   return mpg;   
   }   
   (Other methods . . .) 
   }