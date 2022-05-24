/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThrowDemo;
/**
 *
 * @author eerie
 */
public class ThrowDemo 
{
 static public void div(int a, int b)
 {
     if(b==0)
     {
     throw new ArithmeticException("Divide By Zero");}
 }
 
 public static void main(String args[])
    {
        try
        {
            div(3,0);
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex);
        }
    }
}
