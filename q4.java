/*
4. Write the statement that calls a superclass constructor and passes the arguments x, y, and z.
*/
super(x,y,z);

/*
5. A superclass has the following method: 
public void setValue(int v) 
{    
   value = v; 
}  
Write a statement that may appear in a subclass 
that calls this method, passing 10 as an argument.
*/
setValue(10);

/*
6. A superclass has the following abstract method: 
public abstract int getValue();  
Write an example of a getValue method that can appear in a subclass.
*/
public int getValue()
{
  return value;
} 

/*
 7. Write the first line of the definition for a Stereo class. 
 The class should extend the SoundSystem class, 
 and it should implement the CDplayable, TunerPlayable, and CassettePlayable interfaces.
 */
 public class Stereo extends SoundSystem implements CDplayable, TunerPlayable, CassettePlayable 

/*
 8. Write an interface named Nameable that specifies the following methods: 
 public void setName(String n) 
 public String getName()
 */
 public interface Nameable
 {
    public void setName(String n); 
    public String getName();
 }