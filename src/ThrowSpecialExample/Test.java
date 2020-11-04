/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThrowSpecialExample;
import java.util.*;
/**
 * So we are making our own Custom AgeChecker If age is not between 18 to 45 it will raise an Exception
 *
 */
class AgeException extends Exception
{
    String msg;
    AgeException(String msg)
    {
        super(msg);
        this.msg=msg;
    }
    public String toString()
    {
        return "MyExceptionOccurred:"+msg;
    }
}
public class Test {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        try{
        System.out.println("Enter the age");    
        int age=obj.nextInt();
        if(age<18 || age>45)
        {
            throw new AgeException("Age is not between 18 and 45");
        }
            }
        catch(AgeException e)
        {
            System.out.println("Caught");
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
    
}
