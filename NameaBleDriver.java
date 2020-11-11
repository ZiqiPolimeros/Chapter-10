

/*
8. Write an interface named Nameable that specifies the following methods: 
public void setName(String n) public String getName() 
*/
public class NameaBleDriver implements Nameable
{
    String name;
    public void setName(Sting n)
    {
      name = n;
    }
    public String getName()
    {
      return name;
    }
    public static void main(String args[])
    {
      Nameable c = new NameableDriver();
      c.setName("w");
      System.out.println("name: "+ c.getName());
    }
}



