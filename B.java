/*
 1. Write the first line of the definition for a Poodle class. 
 The class should extend the Dog class.	
 */
 
 //public class Poodle extends Dog
 
 /*
 	2.	Look	at	the	following	code,	
   which	is	the	first	line	of	a	class	definition: 
   public class Tiger extends Felis  
   In what order will the class constructors execute?	
*/
//Felis constructor and then Tiger constructor

/*
	3.	Write	the	declaration	for	class	B. 
   The class’s members should be as follows: 
   •	m, an integer. 
   This variable should not be accessible to code outside the class 
   or to any class that extends class B. 
   •	n, an integer. 
   This variable should be accessible only to classes that extend class B 
   or are in the same package as class B. 
   •	setM, getM, setN, and getN. 
   These are the mutator and accessor methods for the member variables m and n. 
   These methods should be accessible to code outside the class. 
   •	calc. 
   This is a public abstract method.  
   
   Next, write the declaration for class D, which extends class B. 
   The class’s members should be as follows: 
   •	q, a double. 
   This variable should not be accessible to code outside the class. 
   •	r, a double. 
   This variable should be accessible to any class that extends class D or is in the same package.
   */
   
   public abstract class B
   {
      private int m;
      protected int n;
      
      public void setM(int m)
      {
         this.m = m;
      }
      public void setN(int n)
      {
         this.n = n;
      }
      public int getM()
      {
         return m;
      }
      public int getN()
      {
         return n;
      }
      public abstract double calc();
      
   }