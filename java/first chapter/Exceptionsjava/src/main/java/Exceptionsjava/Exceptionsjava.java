/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptionsjava;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 *
 * @author eerie
 */
public class Exceptionsjava 
{
    public static void main(String args[])
    {   
        try
        {
            FileInputStream  fs = new FileInputStream("a.txt");
        }catch(FileNotFoundException ex)
        {
            System.out.println("File not found exception");
        }
    }
    
    


    
}
