/*
 Next, write the declaration for class D, which extends class B. 
 The class’s members should be as follows: 
 •	q, a double. 
 This variable should not be accessible to code outside the class. 
 •	r, a double. 
 This variable should be accessible to any class that extends class D or is in the same package.
•	setQ, getQ, setR, and getR. 
These are the mutator and accessor methods for the member variables q and r. 
These methods should be accessible to code outside the class. 
•	calc, a public method that overrides the superclass’s abstract calc method. 
This method should return the value of q times r.

*/
public class D extends  B
{
   private double q;
   protected double r;
   
   public void setQ(double q)
   {
      this.q = q;
   }
   public void setR(double r)
   {
      this.r = r;
   }
   public double getQ()
   {
      return q;
   }
   public double getR()
   {
      return r;
   }
   public double calc()
   {
      return q*r;
   }
}