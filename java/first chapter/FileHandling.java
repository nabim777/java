
import java.io.*;
import java.io.Serializable;
class Demo implements Serializable
{
    public int a;
    public String b;
  
    // Default constructor
    public Demo(int a, String b)
    {
        this.a = a;
        this.b = b;
    }
  
}
  
class FileHandling
{
    public static void main(String[] args)
    {   
        Demo object = new Demo(1, "geeksforgeeks");
        Demo obj1 = new Demo(2,"Hello World");
        String filename = "file.txt";
          
        // Serialization 
        try
        {   
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
              
            // Method for serialization of object
            out.writeObject(object);
             out.writeObject(obj1);
            out.close();
            file.close();
              
            System.out.println("Object has been serialized");
  
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
  
  
        Demo object1[] = new Demo[2];
  
        // Deserialization
        try
        {   
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
              
            // Method for deserialization of object
            object1[0] = (Demo)in.readObject();
            object1[1] = (Demo)in.readObject();  
            in.close();
            file.close();
            for( Demo dl: object1)
            {
            	  
            	System.out.println("Object has been deserialized ");
            	System.out.println("a = " + dl.a);
            	System.out.println("b = " + dl.b);
            }
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
          
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
  
    }
}